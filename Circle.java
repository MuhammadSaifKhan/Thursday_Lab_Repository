package javatraining;


//solution for the instances with the parameters given

public class Circle {
   public int radius;
   public float center;
   static int count;
// creating a  constructor    
  public Circle() {
  System.out.println("This is the constructor");   
  }	
 // creating a constructor with given  parameter 
	public Circle(int radius,float center) {
		this.radius=radius;
		this.center=center;
		count++;
		
	}	
	// creating a method 
	public void show() {
		System.out.println(+center+radius);
	     count++;
	}

	public static void main(String[] args) {
		Circle c = new Circle(3,4f);
		Circle c1= new Circle(19,21f);
		c.show();
		c1.show();
		Circle c2 = new Circle();
		System.out.println("total no of instance! "+Circle.count);
		
	}
  
}