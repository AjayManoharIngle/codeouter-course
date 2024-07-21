package oops.inheritance;

class Vechicle1 { 
	public void driving() {System.out.println("Driving Vechicle1...");};
}

class Vehicle2{
	public void driving() {System.out.println("Driving Vechicle2...");};

}

// This is not allowed. class Auto extends Vechicle1,Vechicle2{

class Auto extends Vechicle1{
	public void driving() {System.out.println("Auto Driving...");};
}

public class MultipleAndHybridInheritance {

	public static void main(String[] args) {
		
		// Multiple - Deriving subclasses from more than one superclass is known as multiple inheritance in Java
		// - In other words, when a class extends multiple classes, it is known as multiple inheritance.
		
		// Problems : 
		// 1. multiple inheritance leads to confusion for the programmer.
		// 2. one class cannot extend more than one class simultaneously.
		
		// Solutions : 
		// 1. Multiple inheritance can be implemented in Java by using interfaces.
		// 2. A class cannot extend more than one class but a class can implement more than one interface.
		
		// [Vehicle1, Vehicle2 <--- Auto]
		
		// Hybrid - A hybrid inheritance in Java is a combination of single and multiple inheritance
		
		// [Vehicle <-- Vehicle1, Vehicle2 <-- Auto] 
	
	}
}
