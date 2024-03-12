package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonDAOImpl implements PersonDAO {

	SessionFactory sf;
	Session session;

	@Override
	public String savePersonDao(Person person) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		String msg = "Your Form Submitted Sucessfully";
		person.setSuccessMessage(msg);
		session.save(person);
		trans.commit();
		if(msg!=null) {
			clearDao(person);
		}
		return "Home.jsp?faces-redirect=true";
	}

	@Override
	public void updatePersonRecordDao(Person person) {
		// TODO Auto-generated method stub

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

	@Override
	public void clearDao(Person person) {
		person.setFirstName(null);
		person.setLastName(null);
		person.setAddress(null);
		person.setDateOfBirth(null);
		person.setEmail(null);
		person.setGender(null);
		person.setIsEmployed(false);
		person.setHasDependents(false);
		person.setIncome(null);
		person.setPhoneNumber(null);
		person.setSsn(null);
		session.clear();
	}

}
