package exception_handling;

public class Return_TryCatch2 {

	public static void main(String[] args) {
		// Case 2: Return statement in catch block but no exception in try block
		System.out.println(m1());
	}
	
	 static int m1()
	 {
	   try {
	      System.out.println("I am in try block");
	   }
	   catch(Exception e)
	   {
	      System.out.println("I am in catch block");
	      return 30; // return statement inside the catch block.
	   }
	  return 100; // return statement at the end of method
	}

}
