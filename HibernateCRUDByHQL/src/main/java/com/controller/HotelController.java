package com.controller;

import java.util.Scanner;

import com.entity.Hotel;
import com.service.HotelService;

public class HotelController {

	public static void main(String[] args) {
		
		Hotel h=new Hotel();
		HotelService hs= new HotelService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to update data");
			System.out.println("Enter 3 to read a data");
			System.out.println("Enter 4 to read all data");
			System.out.println("Enter 5 to delete any data");
			System.out.println("Enter 6 to close app data");
			System.out.println("----------------------------------------------------");
			int btn=sc.nextInt();
			
		switch(btn) {
		case 1: hs.insertData(h);
		System.out.println("----------------------------------------------------");
		
		break;
		case 2:	hs.updateData(h);
		System.out.println("----------------------------------------------------");
		
		break;
		case 3:	hs.fetchSingleeData(h);
		System.out.println("----------------------------------------------------");
		
		break;
		case 4:	hs.fetchAllData(h);
		System.out.println("----------------------------------------------------");
		
		break;
		case 5:	hs.deleteData(h);
		System.out.println("----------------------------------------------------");
		
		break;
		default:
			System.out.println("Application closed");
			System.out.println("----------------------------------------------------");

			System.exit(8);
		}
		
		}
	}
}
