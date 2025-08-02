package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LaptopOneToOne {

	@Id
	private int l_id;
	private String name;
	public LaptopOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LaptopOneToOne [l_id=" + l_id + ", name=" + name + "]";
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LaptopOneToOne(int l_id, String name) {
		super();
		this.l_id = l_id;
		this.name = name;
	}
}
