package com.hib.servlet;

import java.util.Date;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class StudentDAOImpl implements StudentDAO{
	
	SessionFactory sf;
	Session session;
	
	@Override
	public void studentRegistration(Student student) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(student);
		trans.commit();
	}
	
	@Override
	public long loginDao(String Uemail,Date UDob) {
		sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eq("email",Uemail));
		cr.add(Restrictions.eq("dateOfBirth",UDob));
		cr.setProjection(Projections.rowCount());
		long count = (long) cr.uniqueResult();
		return count;
	}
}
