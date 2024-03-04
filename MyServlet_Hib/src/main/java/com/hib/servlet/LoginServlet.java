package com.hib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	String email = (String) req.getParameter("Email");
	String pass = (String) req.getParameter("PassCode");
	PrintWriter out = resp.getWriter();
	System.out.println("Inside the dopost login");
	if(email.equals("ganeshmirda@gmail.com") && pass.equals("Ganesh")) {
//		out.print("Authentication Successfull");
		RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
		rd.forward(req, resp);
	}else {
		System.out.println("Else block");
		resp.setContentType("text/html");
		out.print("<h3 style='color:red'>Invalid Credentials!!!</h3>");
		RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
		rd.include(req, resp);
	}
}
}
