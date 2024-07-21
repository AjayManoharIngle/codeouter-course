package strings;

public class StringMethod10_Contains {

	public static void main(String[] args) {
		
		// contains - searches the sequence of characters in this string.
		
		String name = "Ajay Manohar Ingle";
		boolean result = name.contains("ohar");
		System.out.println(result);
		
		System.out.println(name.contains(" "));
		System.out.println(name.contains(""));
		
		System.out.println(name.contains("a"));
		
		// Limitation : 
		// It only tells string or seq of chars is present in string 
		// It will not tell where exactly index of it is present.
		// We have indexOf method to tell where is present.
	}
}
