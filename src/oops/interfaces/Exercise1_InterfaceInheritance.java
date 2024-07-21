package oops.interfaces;

//Base interface
interface LivingBeing {
 void breathe();
}

//Single Inheritance: Animal extends LivingBeing
interface Animals extends LivingBeing {
 void eat();
}

//Multilevel Inheritance: Mammal extends Animal
interface Mammal extends Animals {
 void giveBirth();
}

//Hierarchical Inheritance: Bird extends LivingBeing
interface Bird extends LivingBeing {
 void fly();
}

//Hybrid Inheritance: Bat implements Mammal and Bird
class Bat implements Mammal, Bird {
 @Override
 public void breathe() {
     System.out.println("Bat is breathing");
 }

 @Override
 public void eat() {
     System.out.println("Bat is eating");
 }

 @Override
 public void giveBirth() {
     System.out.println("Bat is giving birth");
 }

 @Override
 public void fly() {
     System.out.println("Bat is flying");
 }
}

public class Exercise1_InterfaceInheritance {

	public static void main(String[] args) {
		
		// Probalm :  
		// Animal is living being 
		// living being - breath, Animal - eat, mammal - give birth, bird - fly , bat - can do all things
		
		// Create an instance of Bat
        Bat bat = new Bat();

        // Demonstrate all types of inheritance
        bat.breathe();    // LivingBeing
        bat.eat();        // Animal
        bat.giveBirth();  // Mammal
        bat.fly();        // Bird
	}

}
