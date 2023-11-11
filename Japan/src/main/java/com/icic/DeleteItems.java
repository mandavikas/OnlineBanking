package com.icic;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/delete")
public class DeleteItems extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	int empno=Integer.parseInt(request.getParameter("empno"));
	    user u=new user();
	   
	    userDao d=new userDao();
	    String u1 = null;
		try {
			u1 = d.m2(empno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		   
		    userDao d2=new userDao();
		    List<user> u2=d2.m1();
		    
		   
		    
		    request.setAttribute("user", u2);
	    
	    request.setAttribute("output", u1);
	   
	    
	    RequestDispatcher rd=request.getRequestDispatcher("showuser.jsp");
		 
	    rd.forward(request, response);
	
	
	
	}
	



}
