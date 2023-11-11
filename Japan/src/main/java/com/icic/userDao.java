package com.icic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class userDao {


		 
		public List<user> m1()
		{
			
			List<user> l=new ArrayList<user>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
		        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","c##batch6pm","nareshit");
			    PreparedStatement ps1=con.prepareStatement("SELECT * FROM employee");
			    ResultSet rs=ps1.executeQuery();
			   
			   while(rs.next())
			   {
				   user user1=new user();
			    user1.setEmpno(rs.getInt(1));
			   user1.setName( rs.getString(2));
			    user1.setSal(rs.getInt(3));
			    l.add(user1);
			   }
			   
			    return l;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			return l;
		}
		
		public String m2(int Empno)throws Exception
		{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
		        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","c##batch6pm","nareshit");
			    PreparedStatement ps1=con.prepareStatement("delete  FROM employee where empno=?");
			    ps1.setInt(1, Empno);
			    int rs=ps1.executeUpdate();
			   
			   System.out.println(rs);
			return "deleted succefully";
		}
		
		public int m3(int empno,String name,int sal) throws Exception
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","c##batch6pm","nareshit");
		    PreparedStatement ps1=con.prepareStatement("insert into employee values(?,?,?)");
		    ps1.setInt(1, empno);
		    ps1.setString(2, name);
		    ps1.setInt(3,sal);
		    int rs=ps1.executeUpdate();
		    System.err.println(rs);
			return rs;
		}
			
		

	

}
