package com.student.marks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class MarksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		for(int a=1;a<=3;a++)

			Integer sno+a = Integer.parseInt(request.getParameter("num1"));
			String "s"+a+"ame "= request.getParameter("studentName1");
			int mark11 = Integer.parseInt(request.getParameter("marks11"));
			int mark12 = Integer.parseInt(request.getParameter("marks12"));
			int mark13 = Integer.parseInt(request.getParameter("marks13"));
			double total1 = mark11 + mark12 + mark13;
			double average1 = total1 / 3;
		}
		
		
		
		
	}

}
