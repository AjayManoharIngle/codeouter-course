package oops.constructor;

class Animal1{
	
	String animalName;
	String animalColor;
	
	public Animal1(String animalName, String animalColor) {
		this.animalName = animalName;
		this.animalColor = animalColor;
	}
}

public class This_Instance_Variable {

	public static void main(String[] args) {
		
		// this reference can be used to refer to the current class instance variable.

		Animal1 animal = new Animal1("Dog","White");
		System.out.println(animal.animalName + " " + animal.animalColor);
	}
}
