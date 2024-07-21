package oops.constructor;

class Animal6{
	
	String animalName;
	String animalColor;
	Dog dog;
	
	public Animal6(String animalName, String animalColor,Dog dog) {
		this.animalColor = animalColor;
		this.animalName = animalName;
		this.dog = dog;
	}
	
	void printAnimalData(){
		System.out.println("Animal Name : " + animalName);
		System.out.println("Animal Color : " + animalColor);
		System.out.println("Animal Action : " + dog.actionName);
	}
	
}

class Dog{
	
	String actionName;
	
	public Dog(String actionName) {
		this.actionName = actionName;
		Animal6 animal = new Animal6("Sheru","White",this);
		animal.printAnimalData();
	}
}

public class This_Pass_To_Constructor_Call {

	public static void main(String[] args) {
		
		// The keyword “this” can be used as a parameter in the constructor call.
		Dog dog = new Dog("Barking");
	}

}
