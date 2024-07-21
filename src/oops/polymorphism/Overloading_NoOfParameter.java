package oops.polymorphism;

class Calculator2 {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b,int c) {
        return a + b+c;
    }

    public double add(double a, double b) {
        return a + b;
    }
    
    public double add(double a, double b,double c) {
        return a + b + c;
    }
}

public class Overloading_NoOfParameter {

	public static void main(String[] args) {
		
		// No of parmeter is chnaged
		
		Calculator2 cal = new Calculator2();
		System.out.println("Add 2 para int : " + cal.add(1,2));
		System.out.println("Add 3 para int : " + cal.add(1,2));
		System.out.println("Add 2 para double : " + cal.add(0.9,0.1));
		System.out.println("Add 3 para double : " + cal.add(0.9,0.1,0.2));
		
	}
}
