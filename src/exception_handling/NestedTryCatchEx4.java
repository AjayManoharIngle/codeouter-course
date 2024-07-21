package exception_handling;

public class NestedTryCatchEx4 {

	public static void main(String[] args) {
		//Case 4 : if inner catch exception is not found it will search exception in outer try catch
		
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
		    catch(ArithmeticException aie) 
		    {
		      System.out.println("Arithementic Exception is thrown"); 
		      System.out.println(aie.toString()); 
		    } 
		  } 
		  catch(ArrayIndexOutOfBoundsException npe) 
		  { 
		     System.out.println("Array Exception is thrown out side of inner try catch"); 
		     System.out.println(npe.toString()); 
		  } 
	}

}
