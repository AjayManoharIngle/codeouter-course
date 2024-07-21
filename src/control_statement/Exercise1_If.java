package control_statement;

import java.util.Scanner;

public class Exercise1_If {

	public static void main(String[] args) {
		
		// 1. Take Student Age from Student.
		// 2. Restrict student in parties who's age is less 18.
		// 3. Print notice to students with name and Age.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String stud_name = sc.nextLine();
		
		System.out.println("Enter Stduent Age : ");
		int stud_age = sc.nextInt();
		
		if (stud_age < 18) {
		      System.out.println(stud_name + " , you are not allow for party cause age is " + stud_age + " is not more than 18.");
		} 
		
		sc.close();
	}

}
