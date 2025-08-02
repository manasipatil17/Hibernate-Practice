package com.controller;

import com.entity.Hotel;
import com.service.HotelService;

public class HotelController {

	public static void main(String[] args) {
		
		Hotel h=new Hotel();
		HotelService hs= new HotelService();
//	    hs.insertData(h);
//		hs.updateData(h);
//		hs.fetchSingleeData(h);
		hs.fetchAllData(h);
	}
}
