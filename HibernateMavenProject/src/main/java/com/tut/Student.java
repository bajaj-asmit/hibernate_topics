package com.tut;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity

//for second level caching
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	private int id;
	
	private String Sname;
	
	private String city;
	
	private Certificate certi;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String Sname, String city) {
		super();
		this.id = id;
		this.Sname = Sname;
		this.city = city;
	}
    
	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Sname;
	}
	public void setName(String Sname) {
		this.Sname = Sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + Sname + ", city=" + city + "]";
	}

	
}
