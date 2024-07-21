package oops.polymorphism;

class Calculator {
	// Method to add two integers
    public int addInt(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double addDouble(double a, double b) {
        return a + b;
    }
}

public class NeedOfMethodOverlaoding {

	public static void main(String[] args) {
		
		// without using method overloading  - used more no of methods for same functionalities.
		Calculator calculator = new Calculator();
        
        int sum1 = calculator.addInt(3, 5); 
        double sum2 = calculator.addDouble(2.5, 3.5);  
        
        System.out.println("Sum of integers: " + sum1); 
        System.out.println("Sum of doubles: " + sum2); 
        
        // use same method name but different data type arguments, no of parameter, sequence of data type with 
        // same return type.
	}
}
