package oops.constructor;

class Animal5{
	
	String animalName;
	String animalColor;
	
	public Animal5(String animalName, String animalColor) {
		this.animalColor = animalColor;
		this.animalName = animalName;
	}
	
	void printAnimalData(Animal5 animal5){
		System.out.println("Animal Name : " + animal5.animalName);
		System.out.println("Animal Color : " + animal5.animalColor);
	}

	void showData() {
		printAnimalData(this);
	}
}

public class This_Pass_To_Method_Call {

	public static void main(String[] args) {
		// The keyword ‘this’ in Java can be used as an argument while calling
		// the method. It is mainly used in event handling.
		
		Animal5 animal = new Animal5("Dog","White");
		animal.showData();
	}

}
