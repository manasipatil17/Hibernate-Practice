package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Hotel;



public class HotelDao {

	Scanner sc=new Scanner(System.in);
	public void insertData(Hotel h) {
		System.out.println("Enter menu name and price  : ");
		String m=sc.nextLine();
		int p= sc.nextInt();
		
		Hotel h1=new Hotel(m,p);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="insert into Hotel(menu, price) values (:menu, :price)";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("menu", h1.getMenu());
		q.setParameter("price", h1.getPrice());
		
		q.executeUpdate();
		System.out.println("data inserted...");
		ts.commit();
		ss.close();
	}
	
	
	public void updateData(Hotel h) {
		System.out.println("Enter sr.no. with updated menu name and price : ");
		int s=sc.nextInt();
		sc.nextLine();
		String m=sc.nextLine();
		int p= sc.nextInt();

		Hotel h1=new Hotel(s,m,p);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="update  Hotel set menu=:menu, price=:price where srNo=:srNo";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("menu", h1.getMenu());
		q.setParameter("price", h1.getPrice());
		q.setParameter("srNo", h1.getSrNo());
		
		q.executeUpdate();
		System.out.println("data updated...");
		ts.commit();
		ss.close();
	}

	public void fetchSingleData(Hotel h) {
		System.out.println("Enter id to fetch record : ");
		int s=sc.nextInt();

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="from Hotel where srNo=:srNo";
	 	Query<Hotel> q= ss.createQuery(hqlQuery);
    	q.setParameter("srNo", s);
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
		System.out.println("Enter id which you want to delete : ");
		int s=sc.nextInt();
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hotel.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery="delete from Hotel where srNo=:srNo";
	 	MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
	 	q.setParameter("srNo", s);
	 	q.executeUpdate();
	 	System.out.println("Data deleted");
		ts.commit();
		ss.close();
	}
}
