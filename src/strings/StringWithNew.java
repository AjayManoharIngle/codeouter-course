package strings;

public class StringWithNew {

	public static void main(String[] args) {
		
		// By New Keyword
		// - New is used to create objects in heap memory.
		// - Once new is used for strings then string value will store in heap objects as well as SCP.
		
		String name = new String("Namrata");
		System.out.println("String in heap : " + name);
		// stack = name	
		// SCP = Namrata
		// Heap = [name -> Namrata]

		name.concat("Mohite");
		System.out.println("Modify string : " + name);
		// SCP = Namrata, Mohite
		// Heap = [name -> Namrata]
		
		// To achieve to string to be modify then reassigned updated string 
		name = name.concat(" Mohite");
		System.out.println("String changed : " + name);
		// SCP => Namrata, Mohite
		// Heap -> [name -> Namrata Mohite]
	}
}
