package exception_handling;

public class Return_TryCatch3 {

	public static void main(String[] args) {
		// Case 3: Return statement in catch block but exception occurred in try block.
		System.out.println(m1());
	}
	
	static int m1()
	{
	  try {
	     System.out.println("I am in try block");
	     int x = 20/0;
	     System.out.println("Result: " +x);
	  }
	  catch(ArithmeticException ae)
	  {
	     System.out.println("I am in catch block");
	     return 30;
	  }
	 return 100;
	}
}
