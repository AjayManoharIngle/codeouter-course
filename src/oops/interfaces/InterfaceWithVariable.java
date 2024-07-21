package oops.interfaces;

interface X {
	
	int a = 10;
	static int b = 20;
}

// use a and b var inside child class

class Y implements X{
	public void display() {
		System.out.println("Y - Instance Variable & static var : " + a + " & " + b);
	}
}


// use a and b inside interface
interface Z extends X{
	int d = a;
	int e = b;
}

public class InterfaceWithVariable {

	public static void main(String[] args) {
		
		X x = new X() {};
		System.out.println("Instance Variable & static var : " + x.a + " & " + x.b);
		
		System.out.println("Static variable : " + X.b);
		
		Y y = new Y();
		y.display();
		
		Z z = new Z() {};
		System.out.println("Z - Instance Variable & static var : " + x.a + " & " + x.b);
	}
}
