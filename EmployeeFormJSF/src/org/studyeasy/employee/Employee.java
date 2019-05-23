package org.studyeasy.employee;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Employee {
	private String empname;
	private int age;
	private String gender;
	private String status;
	private String[] preferredDept;
	private String refcode;
	private String comment;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String[] getPreferredDept() {
		return preferredDept;
	}



	public void setPreferredDept(String[] preferredDept) {
		this.preferredDept = preferredDept;
	}



	public String getRefcode() {
		return refcode;
	}



	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
