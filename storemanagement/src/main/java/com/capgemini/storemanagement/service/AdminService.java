package com.capgemini.storemanagement.service;

import java.util.List;

import com.capgemini.storemanagement.dto.Users;

public interface AdminService {
public List<String> loginAdmin(String userId, String password);
	
	public boolean addManufactur(Users user);
	public boolean updateManufactur(String user);
	public boolean deleteManufactur(String userId);
	public List<String> viewAllManufacturs(String role);

}
