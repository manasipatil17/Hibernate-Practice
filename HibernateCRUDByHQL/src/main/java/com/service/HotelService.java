package com.service;

import com.dao.HotelDao;
import com.entity.Hotel;

public class HotelService {

	public void insertData(Hotel h) {
		HotelDao hd=new HotelDao();
		hd.insertData(h);
	}
	
	public void updateData(Hotel h) {
		HotelDao hd=new HotelDao();
		hd.updateData(h);
	}
	public void fetchSingleeData(Hotel h) {
		HotelDao hd=new HotelDao();
		hd.fetchSingleData(h);
	}
	public void fetchAllData(Hotel h) {
		HotelDao hd=new HotelDao();
		hd.fetchAllData(h);
	}
	public void deleteData(Hotel h) {
		HotelDao hd=new HotelDao();
		hd.deleteData(h);
	}

}
