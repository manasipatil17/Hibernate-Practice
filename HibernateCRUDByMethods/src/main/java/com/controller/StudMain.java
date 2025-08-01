package com.controller;

import java.util.Scanner;

import com.entities.Employee;
import com.entities.Stud;
import com.service.EmpService;
import com.service.StudService;

public class StudMain {

	public static void main(String[] args) {
		StudService ss= new StudService();
		Stud s=new Stud();
Scanner sc=new Scanner(System.in);
System.out.println("Enter button 1 to 5");
		int btn =sc.nextInt();
		switch(btn) {
		case 1 :ss.insertData(s);
		break;
		case 2 :ss.updateData(s);
		break;
		case 3 :ss.fetchOneRow(s);
		break;
		case 4 :ss.deleteData(s);
		break;
		case 5 :ss.fetchAllData(s);
		break;
		default:
			System.exit(8);
	}
}
}
