package exception_handling;

public class Case3_FinallyNotExecuted {

	public static void main(String[] args) {
		
		// When the System.exit() method is called in the try block before 
		// the execution of finally block, finally block will not be executed.
		
		// write before exception occur in try block - finally not run
		withBeforeException();
	}

	private static void withBeforeException() {
		 int a = 20, b = 0;	
		  try {
		     System.out.println("I am in try block");
		     int c = a/b;
		     System.exit(0);
		     System.out.println("Result: " +c);
		  }
		  catch(ArithmeticException ae)
		  {
		    System.out.println("I am in catch block");
		  }
		  finally 
		  {
		    System.out.println("I am in finally block");	
		  }
		  System.out.println("Statement after finally block");
	}
}
