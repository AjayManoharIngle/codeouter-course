package oops.inheritance;

class Department2 extends Employee{
	
	String empName = "Vijay";
	String deptName = "IT";
	
	void display() {
		System.out.println("Sub class Department: " + empName);
		System.out.println(super.empName + " is in " + deptName + " department and his salary is " + super.empSal);
	}
}

class Accounts2 extends Employee{
	long accNo = 121212L;
	String empName = "Ankur";
	void getEmpSal() {
		System.out.println("Sub class Accounts : " + empName);
		System.out.println(super.empName + " has " + super.empSal + " in account no : " + accNo );
	}
}


public class Super_Instance_Variable {

	public static void main(String[] args) {
		
		// Super Keyword : Super keyword in Java is a reference variable that refers to an immediate superclass object.
		// We can apply super keyword with variables, methods, constructors of parent class.
		
		// Super Instance var : It gets immediate properties of parent class.
		
		Department2 dept = new Department2();
		dept.display();
		
		Accounts2 acc = new Accounts2();
		acc.getEmpSal();
	}
}
