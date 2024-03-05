package com.hib.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String Dob = req.getParameter("Dob");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse(Dob);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the parse exception appropriately
        }
        
        StudentDAOImpl dao = new StudentDAOImpl();
        PrintWriter out = resp.getWriter();
       Long count = dao.loginDao(email, dob);
        if(count == 1) {
//        	RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
        	RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
    		rd.forward(req, resp);
        }
        else {
    		resp.setContentType("text/html");
    		out.print("<h3 style='color:red'>Invalid Credentials!!!</h3>");
    		RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
    		rd.include(req, resp);
        }
	System.out.println("Inside the dopost login");
}
}
