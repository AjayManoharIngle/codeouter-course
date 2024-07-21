package oops.encapsulation;

public class NeedOfEncapsulation {

	public static void main(String[] args) {
		
		// It binds methods and variables together in single unit called encapsulation.
		
		// Without encapsulation : 
		// Creating an object of the Car class
        Car1 myCar = new Car1("Toyota", 2020);

        // Accessing and modifying attributes directly
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

        myCar.model = "Honda";
        myCar.year = 2022;

        // Accessing modified attributes
        System.out.println("Updated Model: " + myCar.model);
        System.out.println("Updated Year: " + myCar.year);
        
        //Problem : the attributes model and year are declared as public, 
        // allowing them to be accessed and modified directly from outside the class. 
        
        // With encapsulation :
        // Creating an object of the Car class
        Car2 myCar2 = new Car2("Toyota", 2020);

        // Accessing attributes using getter methods
        System.out.println("Model: " + myCar2.getModel());
        System.out.println("Year: " + myCar2.getYear());

        // Modifying attributes using setter methods
        myCar2.setModel("Honda");
        myCar2.setYear(2022);

        // Accessing modified attributes
        System.out.println("Updated Model: " + myCar2.getModel());
        System.out.println("Updated Year: " + myCar2.getYear());
        
	}
}
