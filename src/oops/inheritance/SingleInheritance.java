package oops.inheritance;

class Vehicle{
	
	int noOfTyre;
	String vehicleName;
	int noOfSeat;
	
	public Vehicle(int noOfTyre, String vehicleName, int noOfSeat) {
		super();
		this.noOfTyre = noOfTyre;
		this.vehicleName = vehicleName;
		this.noOfSeat = noOfSeat;
	}
}

class Bike extends Vehicle{
	String type = "Bike";
	public Bike(int noOfTyre, String vehicleName, int noOfSeat) {
		super(noOfTyre, vehicleName, noOfSeat);
	}

	@Override
	public String toString() {
		return "Bike [noOfTyre=" + noOfTyre + ", vehicleName=" + vehicleName + ", noOfSeat=" + noOfSeat + "]";
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		// types : Single Level, Multi Level, Hierarchical, Multiple, Hybrid
		// Single ->  When a class is extended by only one class, it is called single-level inheritance in Java
		
		// Parent class <--- Child class = [Vehicle <-- Bike]
		
		Bike bike = new Bike(2,"Pulser",2);
		System.out.println(bike);
		
		
		// Can two childes access one parent :  YES =>  Hierarchical Inheritance type
		// create one more vehicle which extending vehicle class.
	}
}
