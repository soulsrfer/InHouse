package com.google.bean;

public class AddressBean {
	private Integer addressId;
	private String address;
	private String city;
	private String state;
	private Integer pinCode;
	private Integer userId;
	
	
	public AddressBean(Integer addressId, String address, String city, String state, Integer pinCode, Integer userId) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.userId = userId;
	}


	public AddressBean() {
		super();
	}


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) { 
		this.addressId = addressId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getPinCode() {
		return pinCode;
	}


	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
	
}
