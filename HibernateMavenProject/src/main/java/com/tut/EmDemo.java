package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sessionFactory=cfg.buildSessionFactory();
         
	       Student student1=new Student();
	       
	       student1.setId(420);
	       student1.setName("aashish");
	       student1.setCity("paipat");
	       
	       Certificate certificate1=new Certificate();
	       
	       certificate1.setCourse("core java");
	       certificate1.setDuration("1.5 months");
	       
	       student1.setCerti(certificate1);
	       
           Student student2=new Student();
	       
	       student2.setId(111);
	       student2.setName("ashmit");
	       student2.setCity("panipat");
	       
	       Certificate certificate2=new Certificate();
	       
	       certificate2.setCourse("core java");
	       certificate2.setDuration("1.5 months");
	       
	       student2.setCerti(certificate2);
	       
	       
	       Session session=sessionFactory.openSession();
	       
	       
	       
	       Transaction tx = session.beginTransaction();
	       
	       session.save(student1);
	       session.save(student2);
	       tx.commit();
	       
	       session.close();

	}

}
