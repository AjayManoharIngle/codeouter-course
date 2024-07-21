package oops.polymorphism;

class Calculator3 {
    public int add(int a, double b) {
        return a + (int)b;
    }
    
    public int add(double a, int b) {
        return (int)a + b;
    }
}

public class Overlaoding_SequenceOfParameter {

	public static void main(String[] args) {
		
		// Sequences of parameter is changed
		
		Calculator3 cal = new Calculator3();
		System.out.println("a int with b double : " + cal.add(10,0.2));
		System.out.println("b int with a double : " + cal.add(0.4, 10));
	}
}
