package com.capgemini.storemanagement.controller;

import java.util.List;

import com.capgemini.storemanagement.dto.Users;
import com.capgemini.storemanagement.exception.SchemaManagementException;
import com.capgemini.storemanagement.service.AdminService;

public class AdminController {
	private AdminService adminService;

	public List<String> getAllmanufactures(String role) {
		List<String> allManufactures = adminService.viewAllManufacturs(role);
		if (allManufactures != null) {
			return allManufactures;
		} else {
			return null;
		}

	}// GetAllManufacture

	public boolean deletemanufacture(String userId) {
		boolean isDeleted = adminService.deleteManufactur(userId);
		if (isDeleted) {
			return true;
		}
		return false;
	}// end of delete Manufacture

	public boolean updatemanufacture(String manufactutre) {
		return adminService.updateManufactur(manufactutre);
	}// End of Update Manufacture

	public boolean addManufacture(Users manufacture) {
		try {
			if (adminService.addManufactur(manufacture)) {
				return true;
			} else {
				return false;
			}
		} catch (SchemaManagementException e) {
			e.printStackTrace();  
		}
		return false;
	}// End of AddManufacture

	public List<String> loginAdminService(Users u) {
		List<String> users = (List<String>) new Users();
		try {
			users = adminService.loginAdmin(u.getUserId(), u.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}// End of Adminlogin

}
