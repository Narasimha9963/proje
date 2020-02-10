package com.capgemini.storemanagement.controller;

import java.util.List;

import com.capgemini.storemanagement.dto.Orders;
import com.capgemini.storemanagement.dto.Products;
import com.capgemini.storemanagement.dto.StoreUnit;
import com.capgemini.storemanagement.dto.Users;
import com.capgemini.storemanagement.service.ManufactureService;

public class ManufactureController {
	private ManufactureService manService;
	
	public List<String> loginManufacturService( Users manufactur) {
		List<String> users = null;
		try {
			users = manService.loginManufact(manufactur.getUserId(), manufactur.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}// End of ManufactureloginService

	public List<String> getAllmanufactures(String role) {
		List<String> allDealers = manService.viewAllDealers(role);
		if (allDealers != null) {
			return allDealers;
		} else {
			return null;
		}
	}// End of getAllDealers
	public boolean addDealer( Users dealer) {
		try {
			if (manService.addDealer(dealer)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// End of AddDealer
	public boolean updateDealer( Users dealer) {
		return manService.modifyDealer(dealer);
	}// End of Update Dealer
	
	public boolean deletemanufacture( String dealerId) {
		boolean isDeleted = manService.removeDealer(dealerId);
		if(isDeleted) {
			return true;
		}
		return false;
	}// end of delete Manufacture
	public boolean addProduct( Products product) {
		try {
			if (manService.addProduct(product)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// End of AddProduct
	public boolean deleteProduct( Integer proId) {
		boolean isDeleted = manService.removeProduct(proId);
		if(isDeleted) {
			return true;
		}
		return false;
	}// end of delete Products
	public List<String> getAllProducts() {
		List<String> allProduct = manService.viewAllProducts();
		if (allProduct != null) {
			for (String products : allProduct) {
				System.out.println(products);
			}
			return allProduct;
		} else {
			return null;
		}
	}// End of getAllDealers
	public List<String> getAllOrders() {
		List<String> allOrders = manService.viewAllOrders();
		if(allOrders != null) {
			return allOrders;
		} else {
			return null;
		}
		
	}// GetAllManufacture
	public List<String> viewStore(){
		List<String> store = manService.viewStore();
		if(store != null) {
			return store;
		} else {
			return null;
		} 
	}
	public boolean updateProducts( Products product) {
		return manService.modifyProduct(product);
	}// End of Update Dealer

	
}
