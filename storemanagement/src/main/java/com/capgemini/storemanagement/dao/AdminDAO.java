package com.capgemini.storemanagement.dao;

import java.util.List;

import com.capgemini.storemanagement.dto.Users;

public interface AdminDAO {
	
	public List<String> loginAdmin(String userId, String password);

	public boolean addManufactur(Users user);
	public boolean updateManufactur(String userId);
	public boolean deleteManufactur(String userId);
	public List<String> viewAllManufacturs(String role);


}
