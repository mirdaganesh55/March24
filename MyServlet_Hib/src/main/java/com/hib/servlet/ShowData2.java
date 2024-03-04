package com.hib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowData2")
public class ShowData2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = (String) req.getParameter("Email");
		String pass = (String) req.getParameter("PassCode");
		PrintWriter out = resp.getWriter();
		if(email.equals("ganeshmirda@123gmail.com") && pass.equals("Ganesh@123")) {
			out.print("Welcome to Login page");
		}else {
			out.print("Invalid Credentials");
		}
	
	}
}
