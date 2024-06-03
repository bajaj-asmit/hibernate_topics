package com.tut;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
       Configuration cfg = new Configuration();
       cfg.configure("com/tut/hibernate.cfg.xml");
       SessionFactory sessionFactory=cfg.buildSessionFactory();
       System.out.println(sessionFactory);
     System.out.println(sessionFactory.isOpen());
     System.out.println(sessionFactory.isClosed());
       Student s1=new Student(101,"sujal","panipat");
//       s1.setId(101);
//       s1.setName("ashmit");
//       s1.setCity("panipat");
       System.out.println(s1);
       
      Address ad1=new Address();
      //ad1.setAddressid(1);
      ad1.setStreet("street 3");
      ad1.setCity("sonipat");
      ad1.setX(1.22);
      ad1.setDate(new Date());
      ad1.setOpen(true);
      
      FileInputStream fis = new FileInputStream("src/main/java/com/tut/pic.jpeg");
      byte[] data=new byte[fis.available()];
      fis.read(data);
      ad1.setImage(data);
      System.out.println(ad1);
       Session session = sessionFactory.openSession();
       System.out.println("running1");

     Transaction tx = session.beginTransaction();
      // session.beginTransaction();
     System.out.println("running 2");
       session.save(s1);
       System.out.println("running 3");
       session.save(ad1);
       System.out.println("running4");
      tx.commit();
      System.out.println("running 5");
       // session.getTransaction().commit();
       session.close();
       System.out.println("done....");
       // 
    }
}
