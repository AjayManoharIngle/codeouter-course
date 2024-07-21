package oops.constructor;

class Animal{
	
	String animalName;
	String animalColor;
	
	public Animal(String animalName, String animalColor) {
		animalName = animalName;
		animalColor = animalColor;
	}
}

public class NeedOfThisKeyword {

	public static void main(String[] args) {
		
		//problem of ambiguity between parameters and instance variables.
		//the parameter’s identifier (formal arguments) is the same as that of the instance variable. 

		Animal animal = new Animal("Dog", "White");
		System.out.println(animal.animalName + " " + animal.animalColor);
		
		// we solve using this keyword
	}

}
