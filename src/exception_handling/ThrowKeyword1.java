package exception_handling;

public class ThrowKeyword1 {

	public static void main(String[] args) {
		// throw keyword - thorw whenver is exception When you know
		
		// After throw statement is not allowed
		
		 int x = 20;
		 int y = 0;
		 try
		 {
		   int z = x/y; // Exception occurred. 
		   System.out.println("Result: " +z); 
		   
//		   ArithmeticException ae = new  ArithmeticException();
//		   throw ae;
		   
		  throw new ArithmeticException();
		  // int j = 0; = not allowed
		 }
		 catch(ArithmeticException ae) {
		     System.out.println("Exception caught: " +ae);
		 }
	}

}
