package exception_handling;

public class Return_Try3 {

	public static void main(String[] args) {
		// Case 3 :  Return statement in try block and at end of method but exception occurred in try block.
		System.out.println(m1());
	}

	static int m1()
	 {
	   try {
	      System.out.println("I am in try block");
	      int x = 10/0;
	      return 50;
	   }
	   catch(ArithmeticException ae)
	   {
	      System.out.println("I am in catch block");
	   }
	  return 20;
	}
}
