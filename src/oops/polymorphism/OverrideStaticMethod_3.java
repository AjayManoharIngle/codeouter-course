package oops.polymorphism;

class P2 { // overriden method
	
	static void sum(int a, int b) {
		System.out.println("Sum P2 : "  + (a+b));
	}
}

class Q2 extends P2{ // overriding method
	
	static void sum(int a, int b) {
		System.out.println("Sum Q2 : " + (a+b));
	}
}

// error -> instance method can not override static method 

public class OverrideStaticMethod_3 {
	
	// Output should be : child class but it is printing parent one 

	public static void main(String[] args) {
		
		// It is printing exact that we want but is not overriding because 
		// see Q is ref var type of Q so it prints
		Q2 q = new Q2();
		q.sum(10, 20);
		
		// Here p is ref var which type of P2 and it should not override because method is static 
		// static method always check object at class level and instance method always check object at object level
		// method resolution is always happen at run time.it is method hiding..
		
		P2 p = new Q2();
		p.sum(20,30);
	}

}
