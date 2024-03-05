package com.hib.servlet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CourseDAOImpl implements CourseDAO {

	SessionFactory sf;
	Session session;

	@Override
	public List<Course> showCourseList() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Course.class);
		List<Course> courseList = cr.list();
		return courseList;
	}
}
