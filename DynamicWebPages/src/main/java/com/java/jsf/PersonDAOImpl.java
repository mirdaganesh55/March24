package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

public class PersonDAOImpl implements PersonDAO {

	SessionFactory sf;
	Session session;
	
	int nextId = 0;
	public  int getNextPersonId() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		try {
			Criteria criteria = session.createCriteria(Person.class);
			criteria.setProjection(Projections.max("personId"));
			Integer maxId = (Integer) criteria.uniqueResult();
			 if (maxId == null) {
	                return 1; // If no records, start from 1
	            } else {
	                return maxId + 1; // Increment the maxId
	            }
		}
		finally {
			System.out.println("Generated the personID");
		}
	}
	
	@Override
	public String savePersonDao(Person person, Employment employment) {
	    SessionFactory sf = SessionHelper.getConnection();
	    Session session = sf.openSession();
	    Transaction trans = session.beginTransaction();
	    String msg = "Your Form Submitted Successfully";
	    int genId = getNextPersonId();
	    person.setSuccessMessage(msg);
	    person.setPersonId(genId);
	    session.save(person);
	    System.out.println(person);
	    trans.commit();
	    System.out.println("From Save " + person.getPersonId());
	    session.close();

	    if (person.getIsEmployed() == true) {
	        session = sf.openSession();
	        Transaction transaction = session.beginTransaction();
	        employment.setPersonId(person.getPersonId());
	        System.out.println("Person Id " + person.getPersonId());
	        session.save(employment);
	        transaction.commit();
	        session.close();
	    }
	    return "Home.jsp?faces-redirect=true";
	}

	@Override
	public Person updatePersonRecordDao(Person person) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Person.class);
		List<Person> list =  criteria.list();
		return (Person) list;
	}
	
	@Override
	public List<Person> getAllPersonRecordDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Person.class);
		List<Person> personList = cr.list();
		System.out.println(personList);
		return personList;
	}
}
