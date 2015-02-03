package com.vrtoonjava.banking;

public class Order {

	private int id;
	private int amount;
	private String userId;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getTypes() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
