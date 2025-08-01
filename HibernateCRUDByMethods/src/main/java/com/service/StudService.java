package com.service;

import com.dao.StudDao;
import com.entities.Stud;

public class StudService {
public void insertData(Stud s) {
		
		StudDao sd = new StudDao();
		sd.insertData(s);
	}
	
public void updateData(Stud s) {
	StudDao sd = new StudDao();
	sd.updateData(s);
	}
public void fetchOneRow(Stud s) {
	StudDao sd = new StudDao();
	sd.fetchOneRow(s);
}

public void deleteData(Stud s) {
	
	StudDao sd = new StudDao();
	sd.deleteData(s);
}

public void fetchAllData(Stud s) {
	
	StudDao sd = new StudDao();
	sd.fetchAllData(s);
}

}
