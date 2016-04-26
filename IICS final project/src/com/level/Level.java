package com.level;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Level")
public class Level extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String Selected_year = request.getParameter("OP") ;
		 response.setContentType("text/html");
	     out.println("<h4>Selected Year Level Is :</h4>");
	     out.println("<br><font color=black>"+Selected_year+"</font>");
	     switch(Selected_year)
	     {case "First year":
	    	out.println("<a href='First_Year.html'>Proceed</a>");
	     case "Second year":
		    	out.println("<a href='Second_Year.html'>Proceed</a>");
	     case "Third year":
		    	out.println("<a href='Third_Year.html'>Proceed</a>");	
	     case "Fourth year":
		    	out.println("<a href='Fourth_Year.html'>Proceed</a>");	

	     }
	    
	     out.close();
	}
	}


