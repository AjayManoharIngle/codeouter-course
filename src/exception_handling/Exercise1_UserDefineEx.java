package exception_handling;

import java.util.Scanner;

class InvalidNumber extends Exception{
	public InvalidNumber(String msg) {
		super(msg);
	}
}

public class Exercise1_UserDefineEx {

	public static void main(String[] args) {
		
		// take number from user and allow square of number if number is less than 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no : ");
		int no = sc.nextInt();
		
		try {
			int res = IsNumberAllowed(no);
			System.out.println("Square of " + no + " is : " + res);
		} catch (InvalidNumber e) {
			System.out.println(e);
		}
		sc.close();
	}

	private static int IsNumberAllowed(int no) throws InvalidNumber {
		if(no > 100) {
			throw new InvalidNumber(no + " is invalid number.");
		}
		else {
			return (no*no);
		}
	}

}
