package recursion;

public class NeedOfRecursion {

	public static void main(String[] args) {
		
		// Recursion is a programming concept where a method calls itself.
		
		// The base case is the termination condition that stops the recursion,
		// while the recursive case involves calling the method itself with modified parameters.
		
		// It's important to ensure that recursive calls move towards the base case and eventually terminate.
		// Otherwise, the recursion can lead to a stack overflow, causing the program to crash.
		
		// Simple Example :
		
		// To print name 5 times.
		
		printName("Ajay",5);
		

	}

	private static void printName(String name,int n) {
		
		if(name == "" || name == null || n == 0) {
			return;
		}
		else {
			printName(name,n-1);
			System.out.println(name);
		}
	}
	
	// p("Ajay",5) -> Ajay
	// p("Ajay",4) -> Ajay
	// p("Ajay",3) -> Ajay
	// p("Ajay",2) -> Ajay
	// p("Ajay",1) -> Ajay
	// p("Ajay",0) 
}
