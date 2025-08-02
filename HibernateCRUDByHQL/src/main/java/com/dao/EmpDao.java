package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Emp;

public class EmpDao {

	public void insertData(Emp e) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "insert into emp(name, age) values (:name, :age)";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("name", "Manasi");
		q.setParameter("age", 21);
		q.executeUpdate();
		
	    System.out.println("Data is inserted...");
		ts.commit();
		ss.close();
	}
	
	public void updateData(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss= sf.openSession();
	    Transaction ts= ss.beginTransaction();
	    
	    String hqlquery ="update Emp set name=:myname, age=:myage where id=:myid";
	    MutationQuery q= ss.createMutationQuery(hqlquery);
	    q.setParameter("myname", "om");
	    q.setParameter("myage", 23);
	    q.setParameter("myid", 1);
	    q.executeUpdate();
	    System.out.println("Data is updated...");
	    ts.commit();
	    ss.close();
	
	}
	
	public void deleteData(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss= sf.openSession();
	    Transaction ts= ss.beginTransaction();
	    
	    String hqlquery ="delete from Emp where id=:myid";
	    MutationQuery q= ss.createMutationQuery(hqlquery);
	    q.setParameter("myid", 1);
	    q.executeUpdate();
	    System.out.println("Data is deleted...");
	    ts.commit();
	    ss.close();
	
	}
	
	public void fetchSingleData(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss= sf.openSession();
	    Transaction ts= ss.beginTransaction();
	    
	    String hqlquery =" from Emp where id=:myid";
	    	Query<Emp> q= ss.createQuery(hqlquery);
	    	q.setParameter("myid", 2);
	       Emp e1=q.getSingleResult();
	    System.out.println(e1);
	    ts.commit();
	    ss.close();
	
	}
	
	public void fetchAllData(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss= sf.openSession();
	    Transaction ts= ss.beginTransaction();
	    
	    String hqlquery =" from Emp ";
	    	Query<Emp> q= ss.createQuery(hqlquery, Emp.class);
	   List<Emp> list =q.getResultList();
	       
	   for (Emp emp : list) {
		System.out.println(emp);
	}
	   
	    ts.commit();
	    ss.close();
	
	}
}
