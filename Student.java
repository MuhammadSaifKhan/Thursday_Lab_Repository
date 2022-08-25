package javatraining;
 class Student{
	private String name;
	protected int id;
	double grade;
	
	public void setName(String n){
		this.name = n;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public Boolean IsPassed(double grade){
		return null;
	}
}
class Undergrad extends Student{
	public Boolean IsPassed(double grade){
		if(grade<55.0)
			return true;
		return false;
	}
}
class Grad extends Student{
	public Boolean isPassed(double grade){
		if(grade<=69.0)
			return true;
		return false;
	}
}

public class LabTest{
	public static void main(String args[]){
		// undergraduate student
		Undergrad ug = new Undergrad();
		ug.setName("Manish");
		ug.setId(22);
		ug.grade = 55.0;
		System.out.println("An undergrade student  NAME : " +ug.getName());
		System.out.println("ID :" + ug.getId()) ;
		System.out.println("Grade:" + ug.grade);
		if(ug.IsPassed(ug.grade))
			System.out.println("You passed this test");
		else
			System.out.println("work hard for next time");


		// Graduate student
		Grad g = new Grad();
		g.setName("Saif");
		g.setId(26);
		g.grade=85.3;
		System.out.println("A Grade student  NAME : " +g.getName());
		System.out.println("ID :" + g.getId()) ;
		System.out.println("Grade:" + g.grade);
		if(ug.IsPassed(ug.grade))
			System.out.println("You passed this test with outstanding performance");	
		else
			System.out.println("passed with distinction");
	}
}
