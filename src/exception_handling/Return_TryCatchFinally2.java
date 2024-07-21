package exception_handling;

public class Return_TryCatchFinally2 {

	public static void main(String[] args) {
		// Case 2: Return statement in catch and finally blocks
		System.out.println(m1());
		// it's override catch value -> 40 to 50
	}
	
	static int m1()
	{
	  try {
	     System.out.println("I am in try block");
	     int x = 10/0;
	     System.out.println("Result: " +x);
	  }
	  catch(ArithmeticException ae)
	  {
	    System.out.println("I am in catch block");
	    return 40;
	  }
	 finally {
	     System.out.println("I am in finally block");	
	     return 50;
	  }
	}

}
