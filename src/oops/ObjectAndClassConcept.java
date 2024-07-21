package oops;

class Car{
	
	String model;
	int year;
	String color;
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + "]";
	}
}

public class ObjectAndClassConcept {

	public static void main(String[] args) {
		
		// Every car object has common properties - model, year
		// Create class Car with state - model, year
		// Behavior - drive, break
		
		// create object of Car
		
		Car car1 = new Car();
		car1.model = "BMW";
		car1.color = "Black";
		car1.year = 2024;
		
		Car car2 = new Car();
		car2.model = "Suzuki";
		car2.color = "Blue";
		car2.year = 2023;
		
		System.out.println("Car 1 Details : " + car1);
		System.out.println("Car 2 Details : " + car2);
	}
}
