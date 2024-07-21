package oops.inheritance;

class Department1 extends Employee{
	String deptName = "IT";
}

class Accounts1 extends Employee{
	long accNo = 121212L;
}

public class InheritanceEx {

	public static void main(String[] args) {
		
		// We inherited all propeties and methods from parent class
		
		Department1 dept = new Department1();
		dept.getEmpDetails();
		System.out.println(dept.empName + " is in " + dept.deptName + " department and his salary is " + dept.empSal);

		System.out.println("++++++++++++++++++++++++++++++++++++");
		Accounts1 acc = new Accounts1();
		acc.getEmpDetails();
		System.out.println(acc.empName + " has " + acc.empSal + " in account no : " + acc.accNo );

	}
}
