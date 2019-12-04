package com.example.demo.entity;

public class AccountLDC2  extends Account{
	
	public AccountLDC2(int id, String name, String country, String state) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.state = state;
	}
	int id;
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
	String name;
	String country;
	String state;

}
