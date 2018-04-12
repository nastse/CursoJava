package com.demo.models;

import java.sql.Statement;

public class Signup_Model {
	
	public String doSignUp(String username , String password , String gender , String vehicle , String country , String image)
	{
		try
		{
			Database_Connectivity dc = new Database_Connectivity();
			Statement statment = dc.do_db_connection();
			
			statment.execute("insert into user values('"+username+"' , '"+password+"' , '"+gender+"' , '"+vehicle+"' , '"+country+"' , '"+image+"')");
			
			return "Sign Up Successfully...";
		}
		catch(Exception e)
		{
			System.out.println(e);
			return "Something went wrong pelase try again ! ! !";
		}
	}

}
