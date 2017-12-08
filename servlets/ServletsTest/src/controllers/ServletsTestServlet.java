package com.company.servlets.ServletsTest.src.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletsTestServlet
 */
@WebServlet(description = "A test", urlPatterns = { "/doServlet" })
public class ServletsTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set response content type
	      response.setContentType("text/html");	      
	      int secondNumber;
	      int firstNumber; 
	      int mathDone;
	      firstNumber = Integer.parseInt(request.getParameter("first_number"));
	      secondNumber = Integer.parseInt(request.getParameter("second_number"));
	      mathDone = firstNumber + secondNumber;

	      
	      PrintWriter out = response.getWriter();
	      String title = "This math was done with Java on a Servlet";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	         
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body>\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" + 
	                  "<li><b>"+ firstNumber +" + "+ secondNumber +" = </b>"
	                  + mathDone + "\n" +
	               "</ul>\n" +
	            "</body></html>"
	      );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
