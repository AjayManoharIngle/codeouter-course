package oops.polymorphism;

class P3 { // Overridden method
	
	static void sum(int a, int b) {
		System.out.println("Sum P2 : "  + (a+b));
	}
}

class Q3 extends P3{ // overriding method
	
	static void sum(int a, int b) {
		System.out.println("Sum Q2 : " + (a+b));
	}
}

// error -> instance method can not override static method 

public class MethodHidding {

	public static void main(String[] args) {
		
		Q3 q = new Q3();
		q.sum(10,20); // it is q is type of Q3 like child class only it is not overriding
		
		P3 p = new Q3(); // it is taking p as type of parent so it is not overriding
		p.sum(10,20);
	}

}
