package inputs_taken_from_system;

import java.util.Scanner;

public class useDelimeterMethod {

	public static void main(String[] args) {
		
		// Take input as String
		
		// Student data as a single string
		String studentData = "Ajay-101-A-99.8-true";

		// Create a Scanner to read from the string
		Scanner stringScanner = new Scanner(studentData);
		stringScanner.useDelimiter("-");

		// Reading student information from the string
		String name = stringScanner.next();
		int studentID = stringScanner.nextInt();
		String department = stringScanner.next();
		double gpa = stringScanner.nextDouble();
		boolean isActive = stringScanner.nextBoolean();

		// Displaying the student information
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		System.out.println("Student ID: " + studentID);
		System.out.println("Department: " + department);
		System.out.println("GPA: " + gpa);
		System.out.println("Active: " + isActive);

		// Close the Scanner to release system resources
		stringScanner.close();
	}
}
