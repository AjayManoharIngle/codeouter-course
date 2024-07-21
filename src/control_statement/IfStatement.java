package control_statement;

public class IfStatement {

	public static void main(String[] args) {
		
		// Java provides statements that can be used to control the flow of Java code.
		// Such statements are called control flow statements. 
		
		// Three Types : 
		// Types : 
		// 1. Decision Making statements : If , If-else, If-else-ladder, Nested if, Nested if ladder, Switch
		// 2. Loops or iteration statements : while, do-while, for lopp, for each 
		// 3. Jump statements : break, continue
		
		// Decision Making statements - allow you to make decisions in your code based on certain conditions. 

		// If Statement : Used when we have condition to check
		int no =123;
		// Task 1 : check number is positive number
		if(no > 0) {
			System.out.println(no + " is positive number.");
		}
		
		// Task 2 : check number is negative number
		if(no < 0) {
			System.out.println(no + " is negative number.");
		}
		
		
		// Task 3 : check number is even number
		if(no%2==0) {
			System.out.println(no + " is even number.");
		}
		
		// Task 4 : check number is odd number
		if(no%2!=0) {
			System.out.println(no + " is odd number.");
		}
		
		// Task 5 : To check character is vowels.
		char c = 'A';
		// vowels = aeiou, AEIOU
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println(c + " is vowel.");
		}
	}

}
