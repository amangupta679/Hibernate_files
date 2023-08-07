package org.springframework.hibernateDemo;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Table(name="employee")


public class Employee {
	@Id
	@Column(name="empid")
private int employeeId;
	@Column(name="empid")
private String employeeName ; 
private double salary  ; 

@ManyToOne
@JoinColumn(name="deptno")
Department department ; 



public Employee() {
	super();
}
public Employee(int employeeId, String employeeName, double salary , Department department) {

	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	this.department = department;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

} 

