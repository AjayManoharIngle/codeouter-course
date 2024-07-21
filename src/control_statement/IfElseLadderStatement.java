package control_statement;

public class IfElseLadderStatement {

	public static void main(String[] args) {
		
		// If-Else Ladder Statement : if we have multiple condition to check
		
		// Task 1 : To find maximum number from three numbers.
		int a = 10;
		int b = 20;
		int c = 100;
		
		if(a > b && a > c) {
			System.out.println(a + " is greater no.");
		}else if(b > c && b >a) {
			System.out.println(b + " is greater no.");
		}else {
			System.out.println(c + " is greater no.");
		}
		
		// Task 2 : To check number is [+, - , 0]
		int number = 0;
		if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		
		// Task 3 : 
		// Student had given exam and will get one of grade from A, B, C 
		// which has prizes Bike, Shoes, Book respectively.
		
		char stud_grade = 'A';
        if(stud_grade == 'A') {
        	System.out.println("Student will get bike");
        }
        else if(stud_grade == 'B') {
        	System.out.println("Student will get sports shoes ");
        }
        else if(stud_grade == 'C') {
        	System.out.println("Student will get book to read");
        }
        else {
        	System.out.println("Stduent will not get anything.");
        }
	}
}
