package collections;

class Student {
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class NeedOfCollections {

	public static void main(String[] args) {
		
		// 1. Variable 
		// store 1 value 
		int a = 1;
		
		// store 3 value 
		int p = 2;
		int q = 3;
		int r = 5;
		
		// store 1000 value - need to create 1000 variable
		
		// 2. Class & Object
		Student stu1 = new Student(30,"Ajay"); // we can store age and name two variable but at time for 1 student
		// if we need to store 1000 student --> need to create 1000 object of Student
		
		// 3. Array
		Student[] stu = new Student[1000];
		// you can store 1000 data in this
		stu[0] = new Student(24,"Ajay"); 
		stu[1] = new Student(33,"Vijay"); 
		
		// Limit -> Fixed Size of array, Fixed Homogeneous data store we can't store other object in it.
		// other sorting, searching,manipulation become complex.
	}
}
