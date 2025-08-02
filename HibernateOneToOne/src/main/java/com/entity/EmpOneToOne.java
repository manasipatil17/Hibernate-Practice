package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmpOneToOne {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	@OneToOne
	private LaptopOneToOne l;
	public EmpOneToOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpOneToOne [id=" + id + ", name=" + name + ", city=" + city + ", l=" + l + "]";
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LaptopOneToOne getL() {
		return l;
	}
	public void setL(LaptopOneToOne l) {
		this.l = l;
	}
	public EmpOneToOne(int id, String name, String city, LaptopOneToOne l) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.l = l;
	}
}
