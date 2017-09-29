package com.example.ejb.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.ejb.bussines.Greeting;


@WebServlet("/ServletStateLessEjb")
public class ServletStateLessEjb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private Greeting greeting; 
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String message = greeting.getGreeting(); 
		 
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();  

		 out.println("<html>"); 
		 out.println("<head>");
		 out.println("<title> Ejemplo EJB @Stateless</title>");
		 out.println("</head>");

		 out.println("<body>");
		     out.println("<h1> Ejemplo EJB @Stateless </h1>");
		 	out.println("<h3>"+ message + "</h3>");
		 out.println("</body>");

		 out.println("</html>"); 
		
	
	}

}
