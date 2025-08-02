package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

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
}
