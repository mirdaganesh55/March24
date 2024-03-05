package com.hib.servlet;

public class Dummy {
	public static void main(String[] args) {
		CourseDAO dao = new CourseDAOImpl();
		System.out.println(dao.showCourseList());
	}
}
