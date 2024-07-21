package exception_handling;

public class Case1_FinallyNotExecuted {

	public static void main(String[] args) {
		
		// When the System.exit() method is called in the try block before 
		// the execution of finally block, finally block will not be executed.
		
		// case 1:  write inside try block only - finally not run
		
		withoutException();
	}
	
	private static void withoutException() {
		try {
		       System.out.println("I am in try block");
		       //System.exit(0);
		    }
		    finally {
		       System.out.println("I am in finally block");	
		    }
		   System.out.println("Statement after finally block");
	}
}
