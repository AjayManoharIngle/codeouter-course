package datatypes;

class Course{
	String courseName = "Python";
}

public class DiffOfPrimitveAndNonPrimitive {

	public static void main(String[] args) {
		
		// Primitive : 
		// int is primitive data type
		int x = 10;
		int y = x;
		System.out.println("Intial Value: " +  "x = " + x + ", y = " + y);
			     
		y = 30; // change value of y will not affect to x
		System.out.println("After Value: " + "x = " + x + ", y = " + y);
		System.out.println(" ");
		
		// Non-Primitve - User Defined 
		Course course1 = new Course();
		Course course2 = course1;
		
		System.out.println("Intial Values --- ");
		System.out.println("Course 1 : " + course1.courseName);
		System.out.println("Course 2 : " + course2.courseName);
		
		course2.courseName = "JAVA";
		
		System.out.println("After Changed --- ");
		System.out.println("Course 1 : " + course1.courseName);
		System.out.println("Course 2 : " + course2.courseName);
		
	}
}
