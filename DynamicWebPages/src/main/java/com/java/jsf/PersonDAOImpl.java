package com.java.jsf;

import java.util.List;

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
		session.save(person);
		trans.commit();
		return "success.jsp?faces-redirect=true";
	}

	@Override
	public void updatePersonRecordDao(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getAllPersonRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
