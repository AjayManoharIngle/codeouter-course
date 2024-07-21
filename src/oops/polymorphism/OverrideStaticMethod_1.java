package oops.polymorphism;

class P { // overriden method
	static void sum(int a, int b) {
		System.out.println("Sum P : " + (a+b));
	}
}

class Q extends P{ // overriding method

	// error
//	void sum(int a, int b) {
//		System.out.println("Sum Q : "  + (a+b));
//	}
	
}

// error -> instance method can not override static method 

public class OverrideStaticMethod_1 {

	public static void main(String[] args) {
		Q q = new Q();
		q.sum(10, 20);
	}

}
