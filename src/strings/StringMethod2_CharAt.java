package strings;

public class StringMethod2_CharAt {

	public static void main(String[] args) {
		
		// charAt - Returns characters from string at specified index.
		
		String name = "Ajay";
		// to find 4th character from string.
		// [A, j, a, y] => [0, 1, 2, 3]
		
		char ch1 = name.charAt(2);
		System.out.println("Character at 2nd index : " + ch1);
		
		//Negative and beyond length character is not working.
		char ch  = name.charAt(4); 
		System.out.println("Character at 4th index : " + ch); 
				
		char ch2 = name.charAt(-1);
		System.out.println("Character at -1nd index : " + ch2);
		
	}
}
