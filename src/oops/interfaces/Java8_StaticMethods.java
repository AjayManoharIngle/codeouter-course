package oops.interfaces;

interface E {

	public static void printName(String firstName) {
		System.out.println("E - Your Name : " + firstName);
	}
}

// static method is not override in child classes when we have static method in interface
class G implements E {

	static String lastName ;
	
	// own method - not override
	public static void printName(String firstName) {
		System.out.println("G - Your Name : " + (firstName+" " + lastName));
	}
}

public class Java8_StaticMethods {

	public static void main(String[] args) {
		
		// It also provide body to methods and no need to create objects for calling interface methods.
		// When we have requirement to provide method to parent only and no need to override others ion that case 
		//  we can use static method in parent interface
		
		G.lastName = "Ingle";
		G.printName("Ajay");
	}

}
