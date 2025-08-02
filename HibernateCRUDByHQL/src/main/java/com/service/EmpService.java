package com.service;

import com.dao.EmpDao;
import com.entity.Emp;

public class EmpService {

	public void insertData(Emp e) {
		
		EmpDao ed = new EmpDao();
		ed.insertData(e);
	}
public void updateData(Emp e) {
		
		EmpDao ed = new EmpDao();
		ed.updateData(e);
	}

public void deleteData(Emp e) {
	
	EmpDao ed = new EmpDao();
	ed.deleteData(e);
}

}
