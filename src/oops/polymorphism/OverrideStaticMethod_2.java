package oops.polymorphism;

class P1 { // overriden method
	
	void sum(int a, int b) {
		System.out.println("Sum P1 : "  + (a+b));
	}
}

class Q1 extends P1{ // overriding method
	
	// static method can not hide the instance method
//	static void sum(int a, int b) {
//		System.out.println("Sum Q1 : " + (a+b));
//	}
}

// error -> instance method can not override static method 

public class OverrideStaticMethod_2 {

	public static void main(String[] args) {
		Q1 q = new Q1();
		q.sum(10, 20);
	}

}
