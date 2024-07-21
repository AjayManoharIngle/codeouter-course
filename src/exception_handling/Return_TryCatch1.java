package exception_handling;

public class Return_TryCatch1 {

	public static void main(String[] args) {
		// Case 1: Return statement in try-catch block.
		
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
	       return 30;
	    }
	 }

}
