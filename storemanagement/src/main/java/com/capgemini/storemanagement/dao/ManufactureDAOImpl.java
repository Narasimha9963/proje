package com.capgemini.storemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.storemanagement.dto.Orders;
import com.capgemini.storemanagement.dto.Products;
import com.capgemini.storemanagement.dto.StoreUnit;
import com.capgemini.storemanagement.dto.Users;

public class ManufactureDAOImpl implements ManufactureDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Statement stmt = null;

	public List<String> loginManufact(String userId, String password) {

		List<String> users = new ArrayList<String>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/storemanagement?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			String qry = "select * from users_info where userId ='" + userId + "' and password='" + password + "'";
			pstmt = con.prepareStatement(qry);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				users.add(rs.getString("userId"));
				users.add(rs.getString("password"));

			}
		} catch (Exception e) {
			e.getMessage();
		}

		return users;
	}

	public boolean addDealer(Users dealer) {

		return false;
	}

	public boolean modifyDealer(Users dealer) {

		return false;
	}

	public boolean removeDealer(String dealerId) {

		return false;
	}

	public List<String> viewAllDealers(String role) {
		List<String> manufactures = new ArrayList<>();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/storemanagement?user=root&password=root";
		Connection con = DriverManager.getConnection(dburl);
		String qry = "select * from users_info where role='" + role + "' ";
		pstmt=con.prepareStatement(qry);

		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			manufactures.add(rs.getString("userName"));
			
		}
		} catch (Exception e) {

			e.getMessage();
		}

		return manufactures;

		
	}

	public boolean addProduct(Products product) {

		return false;
	}

	public boolean modifyProduct(Products product) {

		return false;
	}

	public boolean removeProduct(Integer productId) {

		return false;
	}

	public List<String> viewAllProducts() {
		List<String> productlist = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/storemanagement?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			
			String qry = "select * from product_details";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				productlist.add(rs.getString("brand"));
			}
		} catch (Exception e) {

			e.getMessage();
		}
		return productlist;
		

		
	}

	public List<String> viewAllOrders() {
		List<String> productlist = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/storemanagement?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			
			String qry = "select * from order_details";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				productlist.add(rs.getString("userId"));
				productlist.add(rs.getString("email"));
				productlist.add(rs.getString("location"));
				
			}
		} catch (Exception e) {

			e.getMessage();
		}
		return productlist;

		
	}

	public List<String> viewStore() {

		return null;
	}

}
