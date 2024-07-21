package inputs_taken_from_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Use file in Scanner objects as inputs
		// Create a File object representing the file
        File file = new File("C:\\Users\\Sonali\\Desktop\\codeouter\\Course JAVA\\JAVA\\src\\inputs_taken_from_system\\data.txt");

        // Create a Scanner to read from the file
        Scanner fileScanner = new Scanner(file);

        // Read and display data from the file
        String name = fileScanner.next();
        String name1 = fileScanner.next();
    	int studentID = fileScanner.nextInt();
    	String department = fileScanner.next();
        double gpa = fileScanner.nextDouble();
        boolean isActive = fileScanner.nextBoolean();

        System.out.println("First Name: " + name);
        System.out.println("Last Name: " + name1);
        System.out.println("Student ID: " + studentID);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Active: " + isActive);

        // Close the Scanner to release system resources
        fileScanner.close();
	}
}
