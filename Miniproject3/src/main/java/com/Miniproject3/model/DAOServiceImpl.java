package com.Miniproject3.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_project", "root" ,"12345");
			stmnt=con.createStatement();
		} catch (Exception e) {
		}

	}

	

	@Override
	public boolean veryfyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from Login where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}



	@Override
	public void createRegistration(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values ('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	@Override
	public ResultSet showRegistration() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}



	@Override
	public void deleteReg(String email) {
		try {
			stmnt.executeUpdate("delete from registration where email='"+email+"'");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}



	@Override
	public void upadteReg(String email, String mobile) {
		try {
			stmnt.executeUpdate("UPDATE registration SET mobile='"+mobile+"' where email='"+email+"'");
		} catch (Exception e) {
			
		}
	}

}
