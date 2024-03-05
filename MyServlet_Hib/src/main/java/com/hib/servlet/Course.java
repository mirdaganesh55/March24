package com.hib.servlet;

public class Course {

	private int courseId;
	private String courseName;
	private String instructor;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor + "]";
	}
	public Course(int courseId, String courseName, String instructor) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
