package datatypes;

class StudnetClass{
	char division = 'A';
}

class Student{
	String name;
}

public class Exercise2_NonPrimitiveDataType {

	public static void main(String[] args) {
		
		// Three studnets are in same class and changed one of division of students
		// so that every student will moved to new division of class.
		
		StudnetClass classObj1 = new StudnetClass();
		Student student1 = new Student();
		student1.name = "Ajay";
		
		StudnetClass classObj2 = classObj1;
		Student student2 = new Student();
		student2.name = "Vijay";
		classObj2.division = 'B'; // changed one of studnet's division affeted all studnets division's
		
		StudnetClass classObj3 = classObj1;
		Student student3 = new Student();
		student3.name = "Sanjay";
		
		System.out.println("Class of student 1 : " + student1.name + " : "+ classObj1.division);
		System.out.println("Class of student 2 : " +  student2.name + " : "+ classObj2.division);
		System.out.println("Class of student 3 : " +  student3.name + " : "+ classObj3.division);

	}
}
