package exception_handling;

public class Return_TryCatchFinally1 {

	public static void main(String[] args) {
		// Case 1: Return statement in try block and finally block
		System.out.println(m1());
		
		// finally block is override value of try block ->  30 to 50
	}
	
	static int m1()
	 {
	   try {
	      System.out.println("I am in try block");
	      return 30;
	   }
	  finally {
	      System.out.println("I am in finally block");	
	      return 50;
	  }
	}

}
