package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.Stud;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class StudDao {

	public void insertData(Stud s) {
		Configuration cfg= new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Stud.class);
	    
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction ts = ss.beginTransaction();
	    
	    Stud s1= new Stud();
	    
	    s1.setName("Ram");
	    s1.setCity("Akola");
         ss.persist(s1);
         ts.commit();
         ss.close();
         System.out.println("Data inserted...");
         
	}
	
	public void updateData(Stud s) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Stud.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction ts = ss.beginTransaction();
		
		Stud s1= ss.get(Stud.class, 1);
		s1.setName("Raj");
		s1.setCity("Pune");
		
		ss.merge(s1);
		ts.commit();
		ss.close();
		System.out.println("Data updated..");
	}
	
	public void fetchOneRow(Stud s) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Stud.class);
		SessionFactory sf=  cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Stud s1=ss.get(Stud.class, 1);
		System.out.println(s1);
		ts.commit();
		ss.close();
	}
	
	public void deleteData(Stud s) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf =cfg.buildSessionFactory();
        Session ss=	sf.openSession();
        Transaction ts = ss.beginTransaction();
        
        Employee e1=ss.get(Employee.class, 1);
        ss.remove(e1);
        ts.commit();
        ss.close();
        System.out.println("Data deleted successfully...");
        
	}
   
	public void fetchAllData(Stud s) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Stud.class);
		SessionFactory sf =cfg.buildSessionFactory();
        Session ss=	sf.openSession();
        Transaction ts = ss.beginTransaction();
        
        CriteriaBuilder cb=ss.getCriteriaBuilder();
        CriteriaQuery<Object> cq= cb.createQuery();
        Root<Stud> root=cq.from(Stud.class);
        cq.select(root);
        Query q= ss.createQuery(cq);
        List<Stud> l=q.getResultList();
        for ( Stud stud : l) {
			System.out.println(stud);
		}
        ts.commit();
        ss.close();
        
        
	}

}
