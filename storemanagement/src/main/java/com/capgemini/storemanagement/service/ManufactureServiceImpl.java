package com.capgemini.storemanagement.service;

import java.util.List;

import com.capgemini.storemanagement.dao.ManufactureDAO;
import com.capgemini.storemanagement.dto.Orders;
import com.capgemini.storemanagement.dto.Products;
import com.capgemini.storemanagement.dto.StoreUnit;
import com.capgemini.storemanagement.dto.Users;

public class ManufactureServiceImpl implements ManufactureService {

	
	private ManufactureDAO dao;

	@Override
	public List<String> loginManufact(String userId, String password) {
	return dao.loginManufact(userId, password);
	}

	@Override
	public boolean addDealer(Users dealer) {
		return dao.addDealer(dealer);
	}

	@Override
	public boolean modifyDealer(Users dealer) {
		return dao.modifyDealer(dealer);
	}

	@Override
	public boolean removeDealer(String dealerId) {
		return dao.removeDealer(dealerId);
	}

	@Override
	public List<String> viewAllDealers(String role) {
		return dao.viewAllDealers(role);
	}

	@Override
	public boolean addProduct(Products product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean modifyProduct(Products product) {
		return dao.modifyProduct(product);
	}

	@Override
	public boolean removeProduct(Integer productId) {
		return dao.removeProduct(productId);
	}

	@Override
	public List<String> viewAllProducts() {
		return dao.viewAllProducts();
	}

	@Override
	public List<String> viewAllOrders() {
		return dao.viewAllOrders();
	}

	@Override
	public List<String> viewStore() {
		return dao.viewStore();
	}
}
