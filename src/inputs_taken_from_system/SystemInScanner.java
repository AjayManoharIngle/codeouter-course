package inputs_taken_from_system;

import java.util.Scanner;

public class SystemInScanner {

	public static void main(String[] args) {
		
		//The Scanner class in Java is part of the java.util package and 
		//is used to read input from various sources.
		
		// System.in
		Scanner scanner = new Scanner(System.in);

        // Reading student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        
        // Consume the newline character left by nextInt()
        scanner.nextLine();

        System.out.print("Enter student department: ");
        String department = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Is the student active? (true/false): ");
        boolean isActive = scanner.nextBoolean();
        
        // Displaying the entered data
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Active: " + isActive);

        // Closing the Scanner to release system resources
        scanner.close();
	}
}
