package com.service;

import com.dao.EmployeeDao;
import com.entities.Employee;

public class EmpService {

	
	public void insertData(Employee e) {
		
		EmployeeDao ed = new EmployeeDao();
		ed.insertData(e);
	}
	
public void updateData(Employee e) {
		
		EmployeeDao ed = new EmployeeDao();
		ed.updateData(e);
	}
public void fetchOneRow(Employee e) {
	EmployeeDao ed= new EmployeeDao();
	ed.fetchOneRow(e);
}

public void deleteData(Employee e) {
	
	EmployeeDao ed = new EmployeeDao();
	ed.deleteData(e);
}

public void fetchAllData(Employee e) {
	
	EmployeeDao ed = new EmployeeDao();
	ed.fetchAllData(e);
}

}
