package com.hib.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegisServlet")
public class StudentRegisServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String Dob = req.getParameter("Dob");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		String num = req.getParameter("num");
		String address = req.getParameter("address");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse(Dob);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the parse exception appropriately
        }
        Student student = new Student();
        student.setFirstName(fname);
        student.setLastName(lname);
        student.setDateOfBirth(dob);
        student.setGender(gender.charAt(0));
        student.setEmail(email);
        student.setPhoneNumber(num);
        student.setAddress(address);
        
		StudentDAOImpl studentDao = new StudentDAOImpl();
		studentDao.studentRegistration(student);
		System.out.println(student);
		resp.sendRedirect("LoginPage.jsp");
	}
	
}
