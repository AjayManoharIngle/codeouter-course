package oops.inheritance;

class Employee1{
	
	String empName = "Ajay";
	int empSal = 100000;
	
	void getEmpDetails() {
		System.out.println("Employee details : " + empName + " : " + empSal);
	}

	public Employee1(int id) {
		System.out.println("Employee constructor running..." + id);
	}
}

class Department3 extends Employee1{
	private int id;
	public Department3(int id) {
		super(id);
		this.id = id;
	}
	
	void display() {
		if(id == 101) {
			System.out.println(empName + " is in HR dept");
		}else {
			System.out.println(empName + " is in IT dept");
		}
	}
}

class Accounts3 extends Employee1{
	public Accounts3(int id) {
		super(id);
	}
}

public class Super_Constructor {

	public static void main(String[] args) {
		
		// Super constructor : it invoke immediate constructor of parent class
		
		Department3 dept = new Department3(103);
		dept.display();
		Accounts3 acc = new Accounts3(102);
		
	}
}
