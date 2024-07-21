package exception_handling;

public class MultipleCatchEx1 {

	public static void main(String[] args) {
		// Each catch block is capable of catching a different exception. 
		
		try
		 { 
		// Creating an array of six integer elements.
		   int arr[] = new int[6]; 
		   arr[3] = 20/0; // Exception occurred. 
		   System.out.println("I am in try block"); 
		 } 
		 catch(ArithmeticException ae)
		 { 
		   System.out.println("A number cannot be divided by zero, Illegal operation in java"); 
		 } 
		 catch(ArrayIndexOutOfBoundsException e)
		 { 
		   System.out.println("Accessing array element outside of specified limit"); 
		 } 
		 catch(Exception e)
		 { 
		    System.out.println(e.getMessage()); 
		  } 
		  System.out.println("I am out of try-catch block"); 
		 } 
}
