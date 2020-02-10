package com.capgemini.storemanagement.controller;

import java.util.List;

import com.capgemini.storemanagement.dto.Orders;
import com.capgemini.storemanagement.dto.Products;
import com.capgemini.storemanagement.dto.StoreUnit;
import com.capgemini.storemanagement.dto.Users;
import com.capgemini.storemanagement.service.DealerService;

public class DealerController {
	private DealerService dealerService;

	public List<String> loginDealerService(Users dealer) {
		List<String> users = (List<String>) new Users();
		try {
			users = dealerService.loginDealer(dealer.getUserId(), dealer.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}// End of dealer login

	public List<String> showAllProducts() {
		List<String> allProduct = dealerService.showAllproducts();
		if (allProduct != null) {
			for (String products : allProduct) {
				System.out.println(products);
			}
			return allProduct;
		} else {
			return null;
		}
	}// End of showAllProducts

	public List<Integer> viewMyStore(Integer storeId) {
		List<Integer> store = dealerService.viewMyStore(storeId);
		if (store != null) {
			for (Integer storedata : store) {
				System.out.println(storedata);
			}
			return store;
		} else {
			return null;
		}

	}// End ViewMyStore

	public boolean placeOrder(Orders order) {
		try {
			if (dealerService.makeOrder(order)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// End of Place Order

	public boolean cancelOrder(Integer orderId) {
		boolean isDeleted = dealerService.deleteOrder(orderId);
		if (isDeleted) {
			return true;
		}
		return false;
	}// end of cancel order

	public List<String> myOrders(String userId) {
		List<String> myorder = dealerService.viewMyOrders(userId);
		if (myorder != null) {
			for (String order : myorder) {
				System.out.println(order);
			}
			return myorder;
		} else {
			return null;
		}

	}// End ViewMyorders

}
