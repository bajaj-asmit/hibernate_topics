package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMap1 {

	public static void main(String[] args) {
	
		   Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sessionFactory=cfg.buildSessionFactory();
	       
	       Session session=sessionFactory.openSession();
	       
	       Emp e1=new Emp();
	       e1.setEid(121);
	       e1.setEmpname("ramu");
	       
	       Emp e2=new Emp();
	       e2.setEid(122);
	       e2.setEmpname("shamu");
	       
	       List<Emp> list1=new ArrayList<Emp>();
	       
	       list1.add(e1);
	       list1.add(e2);
	       
	       Projects p1=new Projects();
	       p1.setPid(12121);
	       p1.setProjectname("Ecommerce website");
	       
	       Projects p2=new Projects();
	       p2.setPid(12321);
	       p2.setProjectname("chatboot");
	       
	       List<Projects> list2=new ArrayList<Projects>();
	       
	       list2.add(p1);
	       list2.add(p2);
	       
	       e1.setProjects(list2);
	       p2.setEmps(list1);
	       
	       Transaction tx= session.beginTransaction();
	       
	       session.save(e1);
	       session.save(e2);
	       session.save(p1);
	       session.save(p2);
	       
	       tx.commit();
	}

}
