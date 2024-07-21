package oops.inheritance;

class Animal {
	
	String animalName;
	String animalColor;
	
	public Animal(String animalName, String animalColor) {
		this.animalColor = animalColor;
		this.animalName = animalName;
		System.out.println("Animal constructor : " + this.animalName + " : " + this.animalColor);
	}
	
	void animalAction(String action,String animal) {
		System.out.println(animal + " is " + action);
	}
	
}
class Dog extends Animal{

	public Dog(String animalName, String animalColor) {
		super(animalName, animalColor);
	}
}

class Cat extends Animal{

	public Cat(String animalName, String animalColor) {
		super(animalName, animalColor);
	}
	
}

public class Excercise1_SuperKeyword {

	public static void main(String[] args) {
		
		// create parent class animal with color,name and actions 
		// subclass - Dog and Cat
		
		Dog dog  =new Dog("Sheru","Brown");
		dog.animalAction("bark", "Dog");
		
		Cat cat = new Cat("Mau","White");
		cat.animalAction("meuoo","Cat");
	}
}
