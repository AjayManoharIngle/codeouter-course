package oops.polymorphism;

class Parent {
	int sum(double a, double b) {
		System.out.println("Sum in Parent....");
		return (int) (a+b);
	}
	
	static int sum1(double a, double b) {
		System.out.println("Sum in Parent....");
		return (int) (a+b);
	}
}

class Child extends Parent{
	int sum(int a, int b) {
		System.out.println("Sum in child");
		return a+b;
	}
	
	static int sum1(int a, int b) {
		System.out.println("Sum in child");
		return a+b;
	}
}

public class Overlaoding_In_SubClass {

	public static void main(String[] args) {
		
		// static method and non-static method both can be overload.
		
		Child c = new Child();
		System.out.println(c.sum(10,20));
		System.out.println(c.sum1(10,20));
		
		Parent p = new Child();
		System.out.println(p.sum(19,21));
		System.out.println(p.sum1(19,21));
	}
}
