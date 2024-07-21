package exception_handling;

public class MultipleCatchEx3 {

	public static void main(String[] args) {
		
		// if u first write parent Runtime ex then below catch will get complie time error
		
		try 
		  { 
		    int x = 10;
		    int y = 0;
		    int z = x / y; 
		    System.out.println("z = " +z); 
		  } 
		  catch(RuntimeException re) 
		  { 
		     System.out.println("Exception thrown: " +re); 
		  } 
//		  catch(ArithmeticException ae) // Unreachable catch block error. 
//		  { 
//		     System.out.println("Exception thrown: " +ae); 
//		  } 
//		  catch(NumberFormatException nfe) // Unreachable catch block error. 
//		  { 
//		     System.out.println("Exception thrown: " +nfe); 
//		  } 
	}
}
