package com.example.demo.entity;

public class AccountLDC1 extends Account{
	
	public AccountLDC1(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	int id;
	String name;
	String country;
	
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
	

}
