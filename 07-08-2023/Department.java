package org.springframework.hibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
@Id
@Column(name="deptno")
private int departmentNo;

@Column(name="deptname")
private String departmentName ; 

private String location ; 

//@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//@JoinColumn(name="deptno")
List<Employee> employee;

public Department() {
	super();
}

public Department(int departmentNo, String departmentName, String location) {

	this.departmentNo = departmentNo;
	this.departmentName = departmentName;
	this.location = location;
}

public int getdepartmentNo() {
	return departmentNo;
}

public void setdepartmentNo(int departmentNo) {
	this.departmentNo = departmentNo;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}

public String getLocation() {
	// TODO Auto-generated method stub
	return null;
} 



}
