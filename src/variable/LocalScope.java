package variable;

public class LocalScope {
	
	int a = 20; // not allowed here in case of local variable accessing at runtime.

	public static void main(String[] args) {
		
		// Variables have a scope, which defines where they can be accessed. 
		
		// Three scopes : Local, Instance, Static
		
		// Local Scope : 
		// - A variable declared inside the body of the method is called local variable. 
		// - Local variables have limited scope within a block or method.
		
		int a = 20;
		System.out.println("Variable a holds value : " + a);
		
		String student_name ="Ajay";
		System.out.println("Student Name : " + student_name);
	}
}
