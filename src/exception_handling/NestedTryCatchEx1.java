package exception_handling;

public class NestedTryCatchEx1 {

	public static void main(String[] args) {
		// When a try block is defined within another try, it is called nested try block in Java.
		// Case 1 : Exception oocurs outside try catch - inner catch will not run

		  String str = "Codeouter Com"; 
		  int x[ ] = {0, 1, 2, 3, 4}; 

		  try // Outer try block 
		  { 
		    str = null; // Exception occurred. 
		    int slength = str.length(); 
		    System.out.println("String length: " +slength); 

		    try // Inner try block 
		    { 
		      int y = 6; 
		      System.out.println(x[y]); 
		    } 
		    catch(ArrayIndexOutOfBoundsException aie) 
		    {
		      System.out.println("Array Exception is thrown"); 
		      System.out.println(aie.toString()); 
		    } 
		  } 
		  catch(NullPointerException npe) 
		  { 
		     System.out.println("Null Exception is thrown "); 
		     System.out.println(npe.toString()); 
		  } 
	}

}
