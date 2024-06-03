package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int eid;
    
	private String empname;
	
	@ManyToMany
	@JoinTable(
			name="emp_lean", 
			joinColumns= { @JoinColumn( name="eid")},
			inverseJoinColumns= { @JoinColumn(name="pid")}
			)
	private List<Projects> projects;

	
	
	public Emp(int eid, String empname, List<Projects> projects) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.projects = projects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", empname=" + empname + ", projects=" + projects + "]";
	}
	
	
}
