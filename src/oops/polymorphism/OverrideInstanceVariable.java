package oops.polymorphism;

class E {
	String name = "E";
}

class F extends E {
	String name = "F";
}

public class OverrideInstanceVariable {

	public static void main(String[] args) {
		
		// We can override instance method from  parent to child 
		// but we can not override instance variable from parent to child
		
		// It is not taking value of parent and it is not subject to polymorphism form.
		
		F f = new F();
		System.out.println("Name : " + f.name );
	}

}
