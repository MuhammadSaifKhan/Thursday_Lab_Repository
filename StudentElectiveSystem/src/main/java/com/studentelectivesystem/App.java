package com.studentelectivesystem;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    
Configuration cfg=new Configuration();
cfg.configure("Hibernate.cfg2.xml");
SessionFactory factory = cfg.buildSessionFactory();

// creating object of student class
Student st = new Student();
st.setId(10);
st.setName("Saif Khan");

// Creating object from subject class
ElectiveSubject s1 = new ElectiveSubject();
s1.setSubject_name("Cloud Computing");
s1.setDuration("4 month");
s1.setId(1);
s1.setStudent(st);

ElectiveSubject s2 = new ElectiveSubject();
s2.setSubject_name("Artificial Intelligence");
s2.setDuration("3 month");
s2.setId(2);
s2.setStudent(st);

ElectiveSubject s3 = new ElectiveSubject();
s3.setSubject_name("Machine Learning");
s3.setDuration("2 month");
s3.setId(3);
s2.setStudent(st);

List<ElectiveSubject>list = new ArrayList<ElectiveSubject>();
list.add(s1);
list.add(s2);
list.add(s3);
st.setSubject(list);

Session session = factory.openSession();
Transaction transaction = session.beginTransaction();
session.save(st);
session.save(s1);
session.save(s2);
session.save(s3);
transaction.commit();
session.close();
}
}
