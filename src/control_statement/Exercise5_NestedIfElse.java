package control_statement;

import java.util.Scanner;

public class Exercise5_NestedIfElse {

	public static void main(String[] args) {
		
		// Student should enter course name is JAVA and count of mock exam paper you solved = 5.
		// only he will crack interview.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Name : ");
		String courseName = sc.nextLine();
		System.out.println("Count of mock paper you solved : ");
		int count = sc.nextInt();
		
		if(courseName.equals("JAVA")) {
			if (count == 5) {
				System.out.println("Yes, You will crack interview.");
			}
			else {
				System.out.println("You have not solved mock exam paper 5 times.");
			}
		}
		else {
			System.out.println("This is not course we are looking for.");
		}
		
		sc.close();
	}
}
