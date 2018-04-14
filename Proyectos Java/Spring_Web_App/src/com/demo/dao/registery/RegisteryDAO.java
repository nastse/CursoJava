package com.demo.dao.registery;

import com.demo.dao.implementation.ProductsDAO;

public class RegisteryDAO {
	
	//DECLARO TODAS LAS INTERFACES
	public static com.demo.dao.layer.ProductsDAO productsDAO;
	
	static {
		//IMPLEMENTACION CLASS
		//CREAMOS UN OBJETO 
		productsDAO = new ProductsDAO();
	}

	public static com.demo.dao.layer.ProductsDAO getProductsDAO() {
		return productsDAO;
	}

	public static void setProductsDAO(com.demo.dao.layer.ProductsDAO productsDAO) {
		RegisteryDAO.productsDAO = productsDAO;
	}

	
	
}
