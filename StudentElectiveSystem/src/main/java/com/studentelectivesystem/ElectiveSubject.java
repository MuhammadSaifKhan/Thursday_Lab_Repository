package com.studentelectivesystem;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectiveSubject {
@Id
private int id;
private String subject_name;
private String duration;
@ManyToOne
private Student  student;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject_name() {
	return subject_name;
}
public void setSubject_name(String subject_name) {
	this.subject_name = subject_name;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public ElectiveSubject() {
	super();
	
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public ElectiveSubject(int id, String subject_name, String duration) {
	super();
	this.id = id;
	this.subject_name = subject_name;
	this.duration = duration;
}
public ElectiveSubject(int id, String subject_name, String duration, Student student) {
	super();
	this.id = id;
	this.subject_name = subject_name;
	this.duration = duration;
	this.student = student;
}

}




