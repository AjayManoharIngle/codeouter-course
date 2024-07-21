package oops.constructor;

class Animal2{
	
	String animalName;
	String animalColor;
	
	public Animal2(String animalName, String animalColor) {
		this.animalName = animalName;
		this.animalColor = animalColor;
	}
	
	void printAnimalData(){
		System.out.println("Animal Name : " + animalName);
		System.out.println("Animal Color : " + animalColor);
	}
	
	void showData1() {
		printAnimalData();
	}
	
	void showData2() {
		this.printAnimalData();
	}
}

public class This_Method {

	public static void main(String[] args) {
		
		// this keyword is used to call the non-static method of the current class.
		// this is not work with static method
		// Java compiler will automatically put “this” keyword while calling method.
		
		Animal2 animal = new Animal2("Dog","White");
		animal.showData1();
		animal.showData2();

	}
}
