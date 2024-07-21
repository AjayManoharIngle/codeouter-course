package exception_handling;

public class Return_Try2 {

	public static void main(String[] args) {
		// Case 2: Return statement in try block and end of method.
		
		System.out.println(m1());
	}

	static int m1()
	 {
	   try {
	      System.out.println("I am in try block");
	      return 50;
	   }
	   catch(Exception e)
	   {
	      System.out.println("I am in catch block");
	   }
	   return 20; // return statement at the end of a method.
	}
}
