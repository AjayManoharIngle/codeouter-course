package strings;

public class StringMethod6_EqualsAndIgnore {

	public static void main(String[] args) {
		
		// Equals => compares the two given strings based on the content of the string. 
		// If any character is not matched, it returns false.
		// If all characters are matched, it returns true.
		
		String a = "Ajay";
		String b = "Ajay";
		System.out.println("A & B => " + a.equals(b));
		
		String c = "AJAY";
		System.out.println("A & C => " + a.equals(c));
		
		// EqualIgnoreCase => compares the two given strings on the basis of 
		// the content of the string irrespective of the case (lower and upper) of the string.
	
		System.out.println("A & C => " + a.equalsIgnoreCase(c));
	}
}
