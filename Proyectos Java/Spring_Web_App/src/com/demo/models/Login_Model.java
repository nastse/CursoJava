package com.demo.models;

import java.sql.ResultSet;
import java.sql.Statement;

public class Login_Model {
	
	public String do_login_process(String username, String password) {
		
		try {
			
			Database_Connectivity dc = new Database_Connectivity();
			Statement statement = dc.do_db_connection();
			
			ResultSet rs = statement.executeQuery("select count(*) from user where username='"+username+"' and password='"+password+"'");
			int count = 0;
			
			while(rs.next()) {
				
				count = rs.getInt(1);
			}
			
			rs.close();
			
			if(count ==1) {

				return "Login_Correcto";	
			}else {

				return "Usuario o contraseña incorrectos";
			}
			
			
		}catch(Exception e){
			
			return "Ha ocurrido un error, vuelve a intentarlo";
		}
		
	}

}
