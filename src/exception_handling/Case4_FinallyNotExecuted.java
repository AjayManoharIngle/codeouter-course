package exception_handling;

public class Case4_FinallyNotExecuted {

	public static void main(String[] args) {
		// case 4 : write inside catch block - finally not run
		System.out.println(insideCatchBlock());
		
	}
	
	private static int insideCatchBlock()
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
	    System.exit(0);
	    return 20;
	  }
	  finally 
	  {
	     System.out.println("I am in finally block");
	     return 50;
	  }
	}

}
