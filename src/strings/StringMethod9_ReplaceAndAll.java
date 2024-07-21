package strings;

public class StringMethod9_ReplaceAndAll {

	public static void main(String[] args) {
		
		// replace ->  returns a string replacing all the old char
		
		String sentence = "Welcome to codeouter and Welcome to java course";
		
		sentence = sentence.replace("to","in world of ");
		System.out.println(sentence);
		
		// Replace all occurrences of string 
		sentence = sentence.replace("Welcome", "enroll");
		System.out.println(sentence);
		
		// Replace all old char to new char
		sentence = sentence.replace('o','b');
		System.out.println(sentence);
		
		// Replace All -> returns a string replacing all the sequence of characters 
		// matching regex and replacement string.
		
		// Normal replace is not support regex.
		sentence = sentence.replace("\\s","-");
		System.out.println("With replace : " + sentence);
		
		sentence = sentence.replaceAll("\\s","-");
		System.out.println("With replaceall : " + sentence);
	}
}
