package variable;

class Student {
    // Instance variables
    String name;
    int age;
    char grade;
}

public class Exercise2_Instance {

	public static void main(String[] args) {
		
		// Write a Java class representing a Student. 
		// Declare instance variables for the student's name, age, and grade. 
		// Create an instance of the class, set values for these variables, and print them.
		
		Student student1 = new Student();

        //Set values for instance variables
        student1.name = "John";
        student1.age = 18;
        student1.grade = 'A';

        //Print the student's information
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Age: " + student1.age);
        System.out.println("Student Grade: " + student1.grade);
	}
}
