package control_statement;

public class Exercise8_WhileLoop {

	public static void main(String[] args) {
		
		// Check number is palindrome number.
		// If we reverse number then also it is same.
		
		// Hint : Look at reverse of number 
		
		int number = 454;
		int reversedNumber = 0;
		int copy = number;
		
		while (number != 0) {
		    int digit = number % 10;
		    reversedNumber = reversedNumber * 10 + digit;
		    number /= 10;
		}
		if(reversedNumber==copy) {
			System.out.println(copy + " is palindrome number.");
		}
		else {
			System.out.println(copy + " is not palindrome number.");
		}
		
	}

}
