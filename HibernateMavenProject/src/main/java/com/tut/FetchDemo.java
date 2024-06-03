package com.tut;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) throws IOException{
		Configuration cfg = new Configuration();
	       cfg.configure("com/tut/hibernate.cfg.xml");
	       SessionFactory sessionFactory=cfg.buildSessionFactory();
	       Session session=sessionFactory.openSession();
	       
	       Student s2=(Student)session.get(Student.class, 101);
	       System.out.println(s2.getName());
	       Student s3=(Student)session.get(Student.class, 101);
	       System.out.println(s3.getName());
        Address s1=(Address) session.load(Address.class, 1);
        System.out.println(s1.getStreet());

	}

}
