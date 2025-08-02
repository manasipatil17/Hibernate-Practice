package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int srNo;
	private String menu;
	private int price;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel( String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	public Hotel(int srNo, String menu, int price) {
		super();
		this.srNo = srNo;
		this.menu = menu;
		this.price = price;
	}
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hotel [srNo=" + srNo + ", menu=" + menu + ", price=" + price + "]";
	}
	
	
}
