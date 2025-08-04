package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpManyToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	private DeptManyToOne d;
	
	
	public EmpManyToOne() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "EmpManyToOne [id=" + id + ", name=" + name + ", d=" + d + "]";
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


	public DeptManyToOne getD() {
		return d;
	}


	public void setD(DeptManyToOne d) {
		this.d = d;
	}


	public EmpManyToOne(int id, String name, DeptManyToOne d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
}
