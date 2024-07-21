package exception_handling;

public class NestedTryCatchEx2 {

	public static void main(String[] args) {
		
		// Case 2 : Exception oocurs inside try catch - inner catch will run and if no exception found run outside exception as per type

		  String str = "Codeouter Com"; 
		  int x[ ] = {0, 1, 2, 3, 4}; 

		  try // Outer try block 
		  { 
		    int slength = str.length(); 
		    System.out.println("String length: " +slength); 

		    try // Inner try block 
		    { 
		      int y = 6; 
		      System.out.println(x[y]);  // Exception occurred. 
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
