package com.demo.dao.implementation;

import java.util.List;

import org.hibernate.Session;

//CAMBIO
//import com.demo.models.HibernateConnection;
import com.demo.dao.implementation.HibernateConnection;

import com.demo.pojo.Products;

public class ProductsDAO implements com.demo.dao.layer.ProductsDAO {

	//SUSTITUYO LOS MODELS POR DAO
public List<Products> getAllProducts(){
		
		//CREO LA SESION DE HIBERNATE - NECESITO CREAR UN CONTROLADOR
		Session session = HibernateConnection.doHibernateConnection().openSession();
		
		List<Products> allProducts = session.createQuery("From Products").list();
		session.close();
		
		//DEVUELVE UN POJO
		return allProducts;
	}
	
}
