package com.hib.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CourseControllerServlet")
public class CourseControllerServlet  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CourseDAO dao = new CourseDAOImpl();
		List<Course> courseList = dao.showCourseList();
        req.setAttribute("courseList", courseList);
        System.out.println(courseList+"------------------------");
        RequestDispatcher disp = req.getRequestDispatcher("showCoursesNew.jsp");
        disp.forward(req, resp);
	}
}
