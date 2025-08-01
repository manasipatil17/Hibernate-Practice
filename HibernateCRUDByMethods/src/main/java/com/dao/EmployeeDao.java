package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeDao {

	public void insertData(Employee e) {
		Configuration cfg= new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Employee.class);
	    
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction ts = ss.beginTransaction();
	    
	    Employee e1= new Employee();
	    
	    e1.setName("Ram");
	    e1.setCity("Akola");
         ss.persist(e1);
         ts.commit();
         ss.close();
         System.out.println("Data inserted...");
         
	}
	
	public void updateData(Employee e) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction ts = ss.beginTransaction();
		
		Employee e1= ss.get(Employee.class, 1);
		e1.setName("Raj");
		e1.setCity("Pune");
		
		ss.merge(e1);
		ts.commit();
		ss.close();
		System.out.println("Data updated..");
	}
	
	public void fetchOneRow(Employee e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=  cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		Employee e1=ss.get(Employee.class, 1);
		System.out.println(e1);
		ts.commit();
		ss.close();
	}
	
	public void deleteData(Employee e) {
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
   
	public void fetchAllData(Employee e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf =cfg.buildSessionFactory();
        Session ss=	sf.openSession();
        Transaction ts = ss.beginTransaction();
        
        CriteriaBuilder cb=ss.getCriteriaBuilder();
        CriteriaQuery<Object> cq= cb.createQuery();
        Root<Employee> root=cq.from(Employee.class);
        cq.select(root);
        Query q= ss.createQuery(cq);
        List<Employee> l=q.getResultList();
        for ( Employee employee : l) {
			System.out.println(employee);
		}
        ts.commit();
        ss.close();
        
        
	}
}
