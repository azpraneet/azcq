package com.Minipro.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectionDB();
	public boolean veryfyLogin(String email, String password);
	public void createReg(String name, String city, String email, String mobile);
	public ResultSet showReg();
	public void deleteReg(String email);
	public void updateReg(String email, String mobile);
}
