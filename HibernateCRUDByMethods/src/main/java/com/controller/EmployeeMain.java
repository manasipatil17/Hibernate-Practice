package com.controller;

import com.entities.Employee;
import com.service.EmpService;

public class EmployeeMain {

	public static void main(String[] args) {
		EmpService es= new EmpService();
		Employee e=new Employee();
		//es.insertData(e);
		
		//es.updateData(e);
		
		//es.fetchOneRow(e);
		
		//es.deleteData(e);
		
		es.fetchAllData(e);
	}
}
