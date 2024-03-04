package com.hib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowData")
public class ShowData extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = (String) req.getParameter("first_name");
		String lname = (String) req.getParameter("last_name");
		System.out.println("Enter the method");
		PrintWriter out = resp.getWriter();
		out.print("Welcome to this page "+fname +" "+lname);
	}
}
