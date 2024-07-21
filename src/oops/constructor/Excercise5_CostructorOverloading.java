package oops.constructor;

class Employee{
	
	String empName;
	int empId;
	int empSalary;
	
	public Employee(String eName, int eId) {
		empName = eName;
		empId = eId;
	}
	
	public Employee(String eName, int eId,int esal) {
		empName = eName;
		empId = eId;
		empSalary = esal;
	}
}

public class Excercise5_CostructorOverloading {

	public static void main(String[] args) {
		
		// Print 2 Employee Detail : emp with name, id, emp with name,id,salary
		
		Employee e = new Employee("Ajay", 1737);
		System.out.println(e.empId + " " + e.empName );
		
		Employee emp = new Employee("Vijay", 1733,30000);
		System.out.println(emp.empId + " " + emp.empName + " " + emp.empSalary);
	}
}
