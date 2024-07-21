package oops.interfaces;

interface A {

	public default void printName(String firstName) {
		System.out.println("A - Your Name : " + firstName);
	}
}

// B is not required to print Name - there is no compile time error for override interface method
class B implements A { };

class C implements A {

	String lastName ;
	
	public C(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void printName(String firstName) {
		System.out.println("C - Your Name : " + (firstName+" "+lastName));
	}
}

public class Java8_defaultMethods {

	public static void main(String[] args) {
		
		// Existing interface if we have abstract method then all child class need override all methods even if it not required 
		// We have default method with implemnattion so that we can override whenever it is needed in child class
		
		A a = new C("Ingle");
		a.printName("Ajay");
	}
}
