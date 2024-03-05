package com.hib.servlet;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EnrollmentDAOImpl implements EnrollmentDAO{
	
	SessionFactory sf;
	Session session;

	@Override
	public String studentEnroll(int courseId) {
		Enrollment enrollment = new Enrollment();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		trans.commit();
		session.save(enrollment);
		return "Enrolled Successfully";
	}

}
