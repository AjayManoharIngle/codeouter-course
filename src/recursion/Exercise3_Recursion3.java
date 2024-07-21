package recursion;

public class Exercise3_Recursion3 {

	public static void main(String[] args) {
		
		// To print every digit of number one after another.
		
		int n = 123;

		printCharacter(n);
	}

	// with recursion
	private static void printCharacter(int no) {
			// base condition 
			if(no <0) {
				System.out.println("Inavalid no");
				return;
			}
			
			// Recursion
			if(no != 0){
				printCharacter(no/10);
				System.out.println(no%10);
			}
	}
	// n = 123 -> 3
	// n = 12  -> 2 
	// n = 1 -> 1
	// n = 0 

}
