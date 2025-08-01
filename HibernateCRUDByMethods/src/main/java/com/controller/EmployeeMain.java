package com.controller;

import java.util.Scanner;

import com.entities.Employee;
import com.service.EmpService;

public class EmployeeMain {

	public static void main(String[] args) {
		EmpService es= new EmpService();
		Employee e=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter button 1 to 5");
		int btn =sc.nextInt();
		switch(btn) {
		case 1 :es.insertData(e);
		break;
		case 2 :es.updateData(e);
		break;
		case 3 :es.fetchOneRow(e);
		break;
		case 4 :es.deleteData(e);
		break;
		case 5 :es.fetchAllData(e);
		break;
		default:
			System.exit(8);
	}
}
}