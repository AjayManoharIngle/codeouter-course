package exception_handling;

public class Case5_FinallyNotExecuted {

	public static void main(String[] args) {
		// case 5 : exception occurs inside finally block - it run but abnormal exception thrown
		
		insidefinallyBlock();
		
	}
	
	private static void insidefinallyBlock()
	{ 
	  int a = 20, b = 0;	
	  try {
	     System.out.println("I am in try block");
	     int c = a/b;
	     System.out.println("Result: " +c);
	  }
	  catch(ArithmeticException ae)
	  {
	     System.out.println("I am in catch block");
	  }
	  finally 
	  {
	     System.out.println("I am in finally block");
	     int x = 30/0; // Exception occurred in finally block.
	     System.out.println("Result: " +x);
	  }
	}

}
