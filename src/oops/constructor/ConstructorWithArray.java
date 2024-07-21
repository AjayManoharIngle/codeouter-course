package oops.constructor;

import java.util.Arrays;

class Student{
	String[] names;
	
	public Student(String[] studNames) {
		names = studNames;
	}
}

public class ConstructorWithArray {

	public static void main(String[] args) {
		
		// Print 4 diffrent names 
		
		Student student = new Student(new String[]{"Ajay","Vijay","Jay","Suraj"});
		System.out.println(Arrays.toString(student.names));
	}
}
