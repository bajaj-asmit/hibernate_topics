package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Projects {
	
	@Id
	private int pid;
	
	@Column(name="project_name")
	private String projectname;
	
	@ManyToMany      ///mappedby=projects this means employe ko nhi handle karna hai sirf projects handle karega mapping
	@JoinTable(
			name="proj_lean", 
			joinColumns= { @JoinColumn( name="eid")},
			inverseJoinColumns= { @JoinColumn(name="pid")}
			)
	private List<Emp> emps;

	public Projects(int pid, String projectname, List<Emp> emps) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.emps = emps;
	}
   
	
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Projects [pid=" + pid + ", projectname=" + projectname + ", emps=" + emps + "]";
	}
	

}
