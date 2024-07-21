package variable;

public class InstanceScope {
	
	int a = 20;
	String student_name = "Ajay";

	public static void main(String[] args) {
		
		// A variable declared inside the class but outside the body of the method, 
		// is called an instance variable.
		// - every objects has it's own copy of instance variable.
		
		//System.out.println("Variable a holds value : " + a);// not allowed
		
		// Create object of class.
		InstanceScope  instanceScope = new InstanceScope();
		System.out.println("Variable a holds value : " + instanceScope.a);
		
		// changes done at one objects
		instanceScope.a = 30;
		System.out.println("Variable a holds value : " + instanceScope.a);
		
		// It will not reflect those changes in other objects
		InstanceScope  instanceScope1 = new InstanceScope();
		System.out.println("Variable a holds value : " + instanceScope1.a);
		
		System.out.println("Student Name : " + instanceScope.student_name);
		
	}
}
