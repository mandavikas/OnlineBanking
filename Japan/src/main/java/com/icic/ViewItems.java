package com.icic;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.*;

@WebServlet("/View")
public class ViewItems extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	    user u=new user();
	   
	    userDao d=new userDao();
	    List<user> u1=d.m1();
	    
	   
	    
	    request.setAttribute("user", u1);
	   
	    
	    RequestDispatcher rd=request.getRequestDispatcher("showuser.jsp");
		 
	    rd.forward(request, response);
	
	
	
	}
	

	


}
