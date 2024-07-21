package strings;

public class Exercise6_StringBuffer {

	public static void main(String[] args) {
		
		// String palindrome
		String str = "radar";
		
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		if(str.equalsIgnoreCase(s.toString()))
			System.out.println(str + " is palindrome string.");
		else
			System.out.println(str + " is  not palindrome string.");
	}
}
