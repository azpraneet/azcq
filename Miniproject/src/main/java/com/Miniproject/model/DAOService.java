package com.Miniproject.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet getAllRegistration();
	public void deleteRegistration(String email);
	public void updateRegistration(String email, String mobile);
}
