package oops.inheritance;

class Car extends Vehicle{

	public Car(int noOfTyre, String vehicleName, int noOfSeat) {
		super(noOfTyre, vehicleName, noOfSeat);
	}

	@Override
	public String toString() {
		return "Car [noOfTyre=" + noOfTyre + ", vehicleName=" + vehicleName + ", noOfSeat=" + noOfSeat + "]";
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		// A class that is inherited by many subclasses is known as hierarchical inheritance in Java. In other words,
		// when one class is extended by many subclasses, it is known as hierarchical inheritance.
		
		// create one more vehicle which extending vehicle class. => 
		// [Vehicle <-- Bike,Car]
		Car car = new Car(4,"Grand Vitara",5);
		System.out.println(car);
	}
}
