package com.icic;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	int empno=Integer.parseInt(request.getParameter("empno"));
	String name=request.getParameter("ename");
	int sal=Integer.parseInt(request.getParameter("sal"));
	
	  user u=new user();
	   
	    userDao d=new userDao();
	    int k=0;
	    try {
			 k=d.m3(empno, name, sal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		request.setAttribute("output", k);
		   
		 userDao d2=new userDao();
		    List<user> u2=d2.m1();
		    
		   
		    
		    request.setAttribute("user", u2);
		    RequestDispatcher rd=request.getRequestDispatcher("showuser.jsp");
		    rd.forward(request, response);

	
	}
}
