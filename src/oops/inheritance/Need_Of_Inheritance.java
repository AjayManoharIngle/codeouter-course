package oops.inheritance;

class Employee{
	
	String empName = "Ajay";
	int empSal = 100000;
	
	void getEmpDetails() {
		System.out.println("Employee details : " + empName + " : " + empSal);
	}
}

class Department {
	
	Employee e = new Employee(); 
	
	String deptName = "IT";
	
	void display() {
		System.out.println(e.empName + " is in " + deptName + " department and his salary is " + e.empSal);
	}
}

class Accounts{
	
	long accNo = 121212L;
	Employee e = new Employee();
	
	void getEmpSal() {
		System.out.println(e.empName + " has " + e.empSal + " in account no : " + accNo );
	}
}

public class Need_Of_Inheritance {

	public static void main(String[] args) {
		
		// To display emp salary dept wise 
		
		// Inheritance - It gets all properties from it's parent class.
		
		Department d = new Department();
		d.display();
		//d.getEmpDetails();
		
		Accounts acc = new Accounts();
		acc.getEmpSal();
		//acc.getEmpDetails();
		
		// Problems : 
		// 1. Duplicate variable and objects of parent class for all it's subclasses 
		// 2. Not reusable and not extended and not maintenance   
		// 3. Not easy to take properties if it is complex structure		
	}

}
