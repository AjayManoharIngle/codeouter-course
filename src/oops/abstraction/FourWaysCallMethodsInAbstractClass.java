package oops.abstraction;

abstract class A {
	A(){
		System.out.println("A is constructor..");
	}
	
	void normal_A_method() {
		System.out.println("A method is running...");
	}
	
	abstract void abstract_A_method();
}

class B extends A{

	@Override
	void abstract_A_method() {
		System.out.println("written implemetation of B instead of A..");
	}
}

public class FourWaysCallMethodsInAbstractClass {

	public static void main(String[] args) {
		
		// Type 1 :  Cannot create object of abstract class
		// A a = new A();
		
		// Type 2 : Parent p = new Child()
		// Abstract class extend by sub class so first line is super which call parents constructor too
		A a = new B();
		a.normal_A_method();
		a.abstract_A_method();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		// Type 3 : create child class object
		B b = new B();
		b.normal_A_method();
		b.abstract_A_method();
		System.out.println("+++++++++++++++++++++++++++++++++");

		
		// Type 4 : Anonymous - without create object of child class override methods
		A a1 = new A() {
			@Override
			void abstract_A_method() {
				System.out.println("Implemnt abstarct method when it objects get called.");
			}
		};
		a1.normal_A_method();
		a1.abstract_A_method();
	}
}
