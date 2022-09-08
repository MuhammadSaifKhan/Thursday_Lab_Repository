// Program Written by Muhammad Saif Khan 
// Program is written under package javatraining
// Given Program gives the code for user defined exceptions
package javatraining;
class MyException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s)
    {
        // TO CALL CONSTRUCTOR OF PARENT EXCEPTION
        super(s);
    }
}
 
    public class Product {
   void productCheck(int weight) throws Exception{
	if(weight<100){
		throw new Exception("Product is invalid");// exception is thrown
	}
   }
   
    public static void main(String args[])
    {
    	Product obj = new Product();
        try
        {
            obj.productCheck(60);
        }
        catch ( Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}