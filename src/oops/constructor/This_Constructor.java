package oops.constructor;

// call default constructor from param constructor
class Animal3{
	
	String animalName;
	String animalColor;
	
	public Animal3(String animalName, String animalColor) {
		this();
		this.animalColor = animalColor;
		this.animalName = animalName;
	}

	public Animal3() {
		System.out.println("Animal Details :");
	}
	
	void printAnimalData(){
		System.out.println("Animal Name : " + animalName);
		System.out.println("Animal Color : " + animalColor);
	}
}

// call param constructor from default constructor
class Animal4{
	
	String animalName;
	String animalColor;
	
	public Animal4(String animalName, String animalColor) {
		this.animalColor = animalColor;
		this.animalName = animalName;
	}

	public Animal4() {
		this("Dog","White");
		System.out.println("Animal Details :");
	}
	
	void printAnimalData(){
		System.out.println("Animal Name : " + animalName);
		System.out.println("Animal Color : " + animalColor);
	}
}

public class This_Constructor {

	public static void main(String[] args) {
		
		// this() can be used to invoke the current class constructor.
		// The invocation of another constructor using ‘this’ keyword must be the first line of constructor only.
		
		Animal3 animal = new Animal3("Dog","White");
		animal.printAnimalData();
		System.out.println("+++++++++++++++++++++++++++");
		
		Animal4 animal1 = new Animal4();
		animal1.printAnimalData();
	}
}
