package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpOneToMany {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int e_id;
	private String emp_name;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public EmpOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpOneToMany(int e_id, String emp_name) {
		super();
		this.e_id = e_id;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "EmpOneToMany [e_id=" + e_id + ", emp_name=" + emp_name + "]";
	}
	
	
	
	
}
