package com.demo.pojo;

import org.hibernate.validator.constraints.NotBlank;

public class User {

	@NotBlank(message="El usuario no puede estar vacio")
	private String username;
	
	@NotBlank(message="La contraseña no puede estar vacia")
	//@Size(min=6, max=10)
	private String password;
	
	private String gendre;
	private String vehicle;
	private String country;
	private String image;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGendre() {
		return gendre;
	}
	public void setGendre(String gendre) {
		this.gendre = gendre;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
