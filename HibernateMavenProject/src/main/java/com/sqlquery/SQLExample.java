package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQLExample {

	public static void main(String[] args) {
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
	Session session= sessionFactory.openSession();
	
	//sql query
	
	String q="select * from student";
	
	NativeQuery nq=session.createSQLQuery(q);
	
	// this sql query return a object so thats why we take a object in list parameter
	
	List<Object[]> list=nq.list();
	
	for(Object[] student:list)
	{
		//System.out.println(Arrays.deepToString(student));
	   System.out.println(student[1]+" "+student[4]);
	}
	sessionFactory.close();
	}

}
