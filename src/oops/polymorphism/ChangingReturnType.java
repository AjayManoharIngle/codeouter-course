package oops.polymorphism;

class Calculator4 {
	
	// same arugument but return type is differnt - not allowed
//    public int add(int a, int b) {
//        return a + b;
//    }
//    public double add(int a, int b) {
//        return a + b;
//    }
	
	// this is allowed
	public int add(int a, int b) {
      return a + b;
	}
	public double add(double a, double b) {
      return a + b;
	}
}

public class ChangingReturnType {

	public static void main(String[] args) {
		
		// Changing return type of methods - method overloading is not possible
		// - Method overloading cannot be done when the return type, method name,
		// and argument list are the same because there may occur ambiguity.
		
		Calculator4 cal = new Calculator4();
		System.out.println("int sum : " + cal.add(1.0,9.0));
		System.out.println("double sum : " + cal.add(10,23));
	}
}
