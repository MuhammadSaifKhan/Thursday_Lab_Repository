package javatraining;

public class Faculty {
   public  String name;
    private int basic;
    public int salary;
    
    public Faculty(String n, int b) {
    	this.name=n;
    	this.basic=b;
    }
    
	public int getSalary() {
		salary =basic;
		return salary;
	}

	public String getDetails(){
		return name +" "+getSalary();
	}
}

	  class AssistantProfessor extends Faculty{
		int DA;
		public AssistantProfessor(String n, int b, int DA){
	    super(n,b);	
		this.DA= DA;
	}
		public int getSalary() {
			return super.getSalary()+((super.getSalary()*DA/100));
		}
		public String getDetails() {
		 return"Professor: "+name+""+this.getSalary();	
		}
	}
    class AssociateProfessor extends AssistantProfessor{
		public int medAllowance;
		public AssociateProfessor(String n,int b,int DA, int medAllowance) {
			super(n,b,DA);
			this.medAllowance=medAllowance;
		}
		public int getSalary() {
			return super.getSalary()+medAllowance;
		
		}
		public String getDetails() {
			return "AssociateProfessor" +name+ " "+getSalary();
		}
	}
   class Professor  extends AssociateProfessor  {
   int OtherAllowance ;
	public Professor(String name, int b, int DA, int medAllowance, int otherAllowance) { 
		super(name, b, DA, medAllowance);
		this.OtherAllowance = otherAllowance;
	}
	public int getsalary()
	{
		return super.getSalary() + ((OtherAllowance*super.getSalary())/100);
	}
	public String getdetails()
	{
		return "OtherAllowance"+ " " + name+ " " + getsalary();
				
	}
   

	public static void main(String[] args) {
		AssistantProfessor a =  new AssistantProfessor("Kishore",6000,3000);
		System.out.println(a.getDetails());
		AssociateProfessor a1 = new AssociateProfessor("Vikas",12000,4000,300);
		System.out.println(a1.getDetails());
		Professor p = new Professor("Akash",25000,7000,4000,2500);
		System.out.println(p.getdetails());

	}

}