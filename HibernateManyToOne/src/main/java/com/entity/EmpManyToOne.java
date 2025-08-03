package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpManyToOne {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	private DeptManyToOne l;

	public EmpManyToOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpManyToOne(int id, String name, DeptManyToOne l) {
		super();
		this.id = id;
		this.name = name;
		this.l = l;
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

	public DeptManyToOne getL() {
		return l;
	}

	public void setL(DeptManyToOne l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "EmpManyToOne [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	
	
}
