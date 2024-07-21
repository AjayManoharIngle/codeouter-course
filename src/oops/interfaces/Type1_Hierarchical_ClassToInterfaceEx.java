package oops.interfaces;

interface Rectangle {
   void calc(int l, int b);
}

class RecArea implements Rectangle {
  public void calc(int l, int b) 
  {
     int area = l * b; // Implementation.
     System.out.println("Area of rectangle = "+area);
  }
}

class RecPer implements Rectangle 
{
   public void calc(int l, int b) 
   {
     int perimeter = 2 * (l + b); // Implementation.
     System.out.println("Perimeter of rectangle = "+perimeter);
   }
}

public class Type1_Hierarchical_ClassToInterfaceEx {

	public static void main(String[] args) {
		// Type : 
		// Class to Interface - Implements 
		// Interface to Interface - extends 
		
		// In above example we implemented inheritance
		
		Rectangle rec = new RecArea();
		Rectangle recp = new RecPer();
		rec.calc(10,20);
		recp.calc(2,3);
		
	}

}
