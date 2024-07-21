package oops.inheritance;

class Honda extends Bike{
	public String type = "Honda";

	public Honda(int noOfTyre, String vehicleName, int noOfSeat) {
		super(noOfTyre, vehicleName, noOfSeat);
	}

	@Override
	public String toString() {
		return "Honda [noOfTyre=" + noOfTyre + ", vehicleName=" + vehicleName + ", noOfSeat=" + noOfSeat + "]";
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		// Parent class <--- Child class 1 <-- Child Class 2 = [Vehicle <-- Bike,Car <-- Honda]
		// A class that is extended by a class and that class is extended by another 
		// class forming chain inheritance is called multilevel inheritance in Java.
		
		Honda honda = new Honda(2,"Honda 6G", 2);
		System.out.println("Type : " + honda.type);
		System.out.println(honda);
		
		// if I want to print parent type : if it has same variable type will always take parent
		Bike bike = honda;
		System.out.println("Parent type of honda : " + bike.type);
		
		// can two or more children's in level wise - YES 
	}
}
