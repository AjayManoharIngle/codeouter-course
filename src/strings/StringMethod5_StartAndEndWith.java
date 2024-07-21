package strings;

public class StringMethod5_StartAndEndWith {

	public static void main(String[] args) {
		
		// checks if this string starts and ends with the given prefix. 
		// It returns true if this string starts and ends  with the given prefix; else returns false.
		// It's care of case sensitive.
		
		// StartWith
		String name = "Ajay";
		boolean result1 = name.startsWith("Aj");
		System.out.println("Start with Aj : " + result1);
		
		// ToOffset -> where you want to start string to check is present or not 
		String name1 = " AjayManoharIngle ";
		boolean result2 = name.startsWith("Ajay",3);
		System.out.println("Start with Ajay from index 3 : " + result2);
		
		boolean result3 = name1.startsWith("yMa",3);
		System.out.println("Start with yMa from index 3 : " + result3);
		
		boolean result4 = name1.startsWith(" ");
		System.out.println("Start with white space: " + result4);

		
		//EndWith
		String name2 = "Ajay ";
		boolean result10 = name2.endsWith("ay");
		System.out.println("End with ay : " + result10);
		
		boolean result11 = name2.endsWith(" ");
		System.out.println("Ends with white space: " + result11);
		
	}
}
