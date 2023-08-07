package org.springframework.hibernateDemo;

import java.util.List;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
@Entity
public class Course {
@Id
@Column(name="course_name")
private String courseName ; 

@Column(name="course_dur")
private int courseDuration;

@Column(name="course_fee")
private double courseFee;

@Column(name="faculty_name")
private String facultyName ; 

@ManyToMany
@JoinTable(name="student_course_registration",joinColumns={@JoinColumn(name="course_name")},inverseJoinColumns= {@JoinColumn(name="stud_id")})
List<Student> student ;

public Course() {
	super();
}

public Course(String courseName, int courseDuration, double courseFee, String facultyName, List<Student> student) {
	super();
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	this.courseFee = courseFee;
	this.facultyName = facultyName;
	this.student = student;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseDuration() {
	return courseDuration;
}

public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}

public double getCourseFee() {
	return courseFee;
}

public void setCourseFee(double courseFee) {
	this.courseFee = courseFee;
}

public String getFacultyName() {
	return facultyName;
}

public void setFacultyName(String facultyName) {
	this.facultyName = facultyName;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
} 


}
