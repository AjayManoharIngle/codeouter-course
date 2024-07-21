package control_statement;

public class IfElseStatement {

	public static void main(String[] args) {
		
		// If-Else Statement : We have condition to check and it has both possibilities.
		
		// Task 1 : To check number is positive or negative.
		int no = -100;
		if(no > 0) {
			System.out.println(no + " is positive.");
		}
		else {
			System.out.println(no + " is negative.");
		}
		
		// Task 2 : To check number is even or odd.
		if(no%2==0) {
			System.out.println(no + " is even.");
		}
		else {
			System.out.println(no + " is odd.");
		}

		// Task 3 : To get maximum and minimum number from two number.
		int a = 199;
		int b =1000;
		if(a > b) {
			System.out.println("Max no is : " + a);
		}
		else {
			System.out.println("Min no is : " + b);
		}
		
		// Task 4 : To check two names are equal.
		String name1 = "Ajay";
		String name2 = "Vijay";
		if(name1.equals(name2)) {
			System.out.println("Both names are equal.");
		}
		else {
			System.out.println("Both names are not equal.");
		}
		
		// Task 5 : To check second number is divisble to first number or not.
		int c = 5;
        int d = 2;
        if(c%d == 0) {
        	System.out.println(d + " is divisble to " + c);
        }
        else {
        	System.out.println(d + " is not divisble to " + c);
        }
	}
}
