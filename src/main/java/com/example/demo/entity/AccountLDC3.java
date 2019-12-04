package com.example.demo.entity;

public class AccountLDC3 extends Account{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	int id;
	public AccountLDC3(int id, String name, String country, String state, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}
	String name;
	String country;
	String state;
	String pincode;

}
