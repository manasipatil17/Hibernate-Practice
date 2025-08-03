package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeptOneToMany {

	@Id
	private int d_id;
	private String dept_name;
	
	@OneToMany
	private List<EmpOneToMany> e;

	public DeptOneToMany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptOneToMany(int d_id, String dept_name, List<EmpOneToMany> e) {
		super();
		this.d_id = d_id;
		this.dept_name = dept_name;
		this.e = e;
	}

	
}