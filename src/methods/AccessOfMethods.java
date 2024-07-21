package methods;

public class AccessOfMethods {

	public static void main(String[] args) {
		
		// Public and Private Method access through current class
		// Private and public both access
		display(100);
		display1(200);
		
		// Public and Private Method access through other class
		// Private method is not access and only public method is access.
		//Services.display(10);
		Services.display1(10);
		
	}
	
	private static void display(int n) {
		System.out.println("Your Number : "  +n);
	}
	
	public static void display1(int n) {
		System.out.println("Your Number : "  +n);
	}
}
