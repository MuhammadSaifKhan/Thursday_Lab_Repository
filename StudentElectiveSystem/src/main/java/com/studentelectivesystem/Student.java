package com.studentelectivesystem;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
@Id
private int id;
private String name;
@OneToMany
private List<ElectiveSubject> subject ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student() {
	super();
	
}
public List<ElectiveSubject> getSubject() {
	return subject;
}
public void setSubject(List<ElectiveSubject> subject) {
	this.subject = subject;
}
public Student(int id, String name, List<ElectiveSubject> subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}


}
