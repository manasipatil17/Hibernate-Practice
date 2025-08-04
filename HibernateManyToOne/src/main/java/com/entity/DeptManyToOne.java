package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeptManyToOne {

	@Id
	private int d_Id;
	private String dept_name;
	public DeptManyToOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptManyToOne(int d_Id, String dept_name) {
		super();
		this.d_Id = d_Id;
		this.dept_name = dept_name;
	}
	public int getD_Id() {
		return d_Id;
	}
	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "DeptManyToOne [d_Id=" + d_Id + ", dept_name=" + dept_name + "]";
	}

	
	
}
