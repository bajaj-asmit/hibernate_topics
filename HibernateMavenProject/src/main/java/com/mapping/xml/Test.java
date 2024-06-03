package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SessionFactory sessionFactory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 
     Session session=sessionFactory.openSession();
     
     Person p1=new Person(1,"asmit","panipat","9588145081");
     
     Transaction tx = session.beginTransaction();
     
     session.save(p1);
     tx.commit();
     session.close();
     sessionFactory.close();
	}

}
