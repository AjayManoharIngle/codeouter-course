package strings;

public class StringMethod7_EmptyAndBlank {

	public static void main(String[] args) {
		
		// Empty :  checks if the input string is empty or not. 
		// Note that here empty means the number of characters contained in a string is zero.
		
		String name = "Ajay";
		System.out.println(name.isEmpty());
		
		name = "";
		System.out.println(name.isEmpty());
		
		// String contains white space
		name = " ";
		System.out.println(name.isEmpty());
		
		// String contains null value
		name = null;
		//System.out.println(name.isEmpty());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// Blank : Check string is empty and if found white spaces return true other wise false
		String name1 = "Ajay";
		System.out.println(name1.isBlank());
		
		name1 = "";
		System.out.println(name1.isBlank());
		
		// String contains white space
		name1 = " ";
		System.out.println(name1.isBlank());
		
		// String contains null value
		name1 = null;
		System.out.println(name1.isBlank());
	}
}
