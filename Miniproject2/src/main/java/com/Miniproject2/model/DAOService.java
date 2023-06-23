package com.Miniproject2.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean veryfyLogin(String email, String password);
	public void createRegistration(String name, String city, String email, String mobile);
	public ResultSet showRegistration();
	public void deleteReg(String email);
	public void updateReg(String email, String mobile);
}
