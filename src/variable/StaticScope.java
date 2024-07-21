package variable;

public class StaticScope {
	
	static int a = 20;

	public static void main(String[] args) {
		
		// - A variable which used for memory management and no need of creation of objects while accessing variable. 
		// - You can create a single copy of the static variable and share it among all the instances of the class.
		// - Memory allocation for static variables happens only once when the class is loaded in the memory

		// static int a = 20; // not allowed here
		
		// Create object of class.
		StaticScope staticScope = new StaticScope();
		System.out.println("Variable a holds value : " + staticScope.a);
		
		// changes done at one objects
		staticScope.a = 30;
		System.out.println("Variable a holds value : " + staticScope.a);
		
		// It is reflected those changes in other objects
		StaticScope staticScope1 = new StaticScope();
		System.out.println("Variable a holds value : " + staticScope1.a);
		
		System.out.println("Variable access without creation of objects : " + StaticScope.a);
		StaticScope.a = 40;
		System.out.println("Variable access without creation of objects : " + StaticScope.a);

	}
}
