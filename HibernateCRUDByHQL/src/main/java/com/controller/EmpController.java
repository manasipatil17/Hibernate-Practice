package com.controller;

import com.entity.Emp;
import com.service.EmpService;

public class EmpController {

	public static void main(String[] args) {
		Emp e=new Emp();
		EmpService es=new EmpService();
		es.insertData(e);
	}
}
