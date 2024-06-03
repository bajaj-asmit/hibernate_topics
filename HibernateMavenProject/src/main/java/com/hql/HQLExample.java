package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;



public class HQLExample {

	public static void main(String[] args) {
	
		 Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sessionFactory=cfg.buildSessionFactory();
	       Session session=sessionFactory.openSession();
	       
	       // HQL syntax
	       
	       // dynamic value input
	       
//	       String query="from Student as s where s.city=:x and s.id=:y";
//	       Query query2=session.createQuery(query);
//	       
//	       query2.setParameter("x", "panipat");
//	       query2.setParameter("y", 561);
//	       //single - (Unique)
//	       // multiple-list
//	       
//	       List<Student> list=query2.list();
//	       
//	       for(Student student:list)
//	       {
//	    	   System.out.println(student.getName());
//	       }

	       
	       //unique value
//	       String query="from Student where city='panipat'";
//	       Query query2=session.createQuery(query);
//	       
//	       //single - (Unique)
//	       // multiple-list
//	       
//	       List<Student> list=query2.list();
//	       
//	       for(Student student:list)
//	       {
//	    	   System.out.println(student.getName() +" "+student.getCerti().getCourse());
//	       }
//	       
	       // multipl e data fetch
//	       String query="from Student";
//	       Query query2=session.createQuery(query);
//	       
//	       //single - (Unique)
//	       // multiple-list
//	       
//	       List<Student> list=query2.list();
//	       
//	       for(Student student:list)
//	       {
//	    	   System.out.println(student.getName());
//	       }
	       
	       
	       /// delete data from database
	       
	       System.out.println("_______________________________________");
//	       
//	       Transaction tx=session.beginTransaction();
//	       
//	       Query q2=session.createQuery("delete from Student s where s.city=:c");
//	       q2.setParameter("c", "chandigharh");
//	       
//	       int r=q2.executeUpdate();
//	       System.out.println("Deleted");
//	       System.out.println(r);
//	       tx.commit();
//	       
//	       session.close();
//	       sessionFactory.close();
	       

	       //Transaction tx=session.beginTransaction();
//	       
//	       Query q2=session.createQuery("update Student set city=:t where id=:id");
//	       q2.setParameter("t", "kurukstra");
//	       q2.setParameter("id", 156);
//	       int r=q2.executeUpdate();
//	       System.out.println("updated");
//	       System.out.println(r);
//	       tx.commit();
//	       
	       
	       Query q3=session.createQuery("select q.question, q.questionid, a.content from Question as q INNER JOIN q.answers as a");
	       List<Object[]> list3= q3.getResultList();
	       
	       for(Object[] arr:list3)
	       {
	    	   System.out.println(Arrays.toString(arr));
	       }
	       session.close();
	       sessionFactory.close();
	}

}
