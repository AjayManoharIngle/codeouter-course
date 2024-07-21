package oops.polymorphism;

class Calculator1 {
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Overlaoding_DataTypeParameter {

	public static void main(String[] args) {
		
		// Data type as parameter different
		
		Calculator1 calculator = new Calculator1();
        
        int sum1 = calculator.add(3, 5); 
        double sum2 = calculator.add(2.5, 3.5);  
        
        System.out.println("Sum of integers: " + sum1); 
        System.out.println("Sum of doubles: " + sum2); 
	}
}
