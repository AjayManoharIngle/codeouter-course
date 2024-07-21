package strings;

public class EqualsInString {

	public static void main(String[] args) {
		
		// equals -> Compares content of two strings for equality.
		String str1 = "Hello";
		String str2 = "Hello";
		boolean areEqual1 = str1.equals(str2); 
		System.out.println("is string is equal : " + areEqual1);
		
		// == -> Checks if two string references point to the same memory 
		// location (reference equality).
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		boolean areEqual2 = (str3==str4); 
		System.out.println("is string is equal : " + areEqual2);
		// HEAP = [str3->"Hello", str4->"Hello"]
		
		String str5 = "Hello";
		String str6 = "Hello";
		boolean areEqual3 = (str5==str6); 
		System.out.println("is string is equal : " + areEqual3);
		// SCP = [str5,str6 -> "Hello"]
		
		String str7 = new String("Hello");
		String str8 = "Hello";
		boolean areEqual4 = (str7==str8); 
		System.out.println("is string is equal : " + areEqual4);
		// SCP = [str8 -> "Hello", str7 -> "Hello"]
		
		
	}
}
