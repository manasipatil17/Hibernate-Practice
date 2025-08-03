package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeptOneToMany {

	@Id
	private int d_id;
	private String dept_name;
	
	@OneToMany
	private EmpOneToMany e;

	public DeptOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptOneToMany(int d_id, String dept_name, EmpOneToMany e) {
		super();
		this.d_id = d_id;
		this.dept_name = dept_name;
		this.e = e;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public EmpOneToMany getE() {
		return e;
	}

	public void setE(EmpOneToMany e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "DeptOneToMany [d_id=" + d_id + ", dept_name=" + dept_name + ", e=" + e + "]";
	}
	
	
}
