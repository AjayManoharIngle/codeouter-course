package strings;

public class StringLiteral {

	public static void main(String[] args) {
		
		// We have two ways to create strings.
		
		// By String literal : 
		// - SCP concept is used and strings stored in SCP not in heap.
		
		String name="Namrata"; 
		System.out.println("String literal : " + name);
		// Stack = name
		// SCP = [name -> Namrata]
		
		name.concat("Mohite");
		System.out.println("Modify String : " + name);
		// SCP = [name -> Namrata], Mohite
		
		// To achieve to string to be modify then reassigned updated string 
		name = name.concat(" Mohite");
		System.out.println("String changed : " + name);
		// SCP => [name -> Namrata Mohite], Mohite
		
	}
}
