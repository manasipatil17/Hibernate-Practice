package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Hotel;



public class HotelDao {

	public void insertData(Hotel h) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="insert into Hotel(menu, price) values (:menu, :price)";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("menu", "Paneer Tika");
		q.setParameter("price", 200);
		
		q.executeUpdate();
		System.out.println("data inserted...");
		ts.commit();
		ss.close();
	}
	public void updateData(Hotel h) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="update  Hotel set menu=:menu, price=:price where srNo=:srNo";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("menu", "butter paneer");
		q.setParameter("price", 250);
		q.setParameter("srNo", 1);
		
		q.executeUpdate();
		System.out.println("data inserted...");
		ts.commit();
		ss.close();
	}

	public void fetchSingleData(Hotel h) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="from Hotel where srNo=:srNo";
	 	Query<Hotel> q= ss.createQuery(hqlQuery);
    	q.setParameter("srNo", 1);
       Hotel h1=q.getSingleResult();
   System.out.println(h1);
		ts.commit();
		ss.close();
	}
	
	public void fetchAllData(Hotel h) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="from Hotel";
	 	Query<Hotel> q= ss.createQuery(hqlQuery);
       List<Hotel> h1=q.getResultList();
        for (Hotel hotel : h1) {
			System.out.println(hotel);
		}
		ts.commit();
		ss.close();
	}
	public void deleteData(Hotel h) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="delete from Hotel where srNo=:srNo";
	 	MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
	 	q.setParameter("srNo", 1);
	 	q.executeUpdate();
		ts.commit();
		ss.close();
	}
}
