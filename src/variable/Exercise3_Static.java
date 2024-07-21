package variable;

class Students {
    // Instance variables
    String name;
    int age;
    char grade;

    // Static variable representing the subject
    static String subject = "Math";
}

public class Exercise3_Static {

	public static void main(String[] args) {
		
		// Create class Student and create some instance variable.
		// Create subject variable which shared among all students. 
		
		 // Create instances of the Student class
		Students student1 = new Students();
		Students student2 = new Students();

        // Set values for instance variables for student1
        student1.name = "John";
        student1.age = 18;
        student1.grade = 'A';

        // Set values for instance variables for student2
        student2.name = "Alice";
        student2.age = 20;
        student2.grade = 'B';

        // Print information for student1
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Age: " + student1.age);
        System.out.println("Student Grade: " + student1.grade);
        System.out.println("Subject: " + Students.subject); // Accessing the static subject
        System.out.println();

        // Print information for student2
        System.out.println("Student Name: " + student2.name);
        System.out.println("Student Age: " + student2.age);
        System.out.println("Student Grade: " + student2.grade);
        System.out.println("Subject: " + Students.subject); // Accessing the static subject

	}
}
