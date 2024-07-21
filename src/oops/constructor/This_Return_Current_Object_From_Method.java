package oops.constructor;

class Animal7{
	
	String animalName;
	String animalColor;
	String actionName;
	
	public Animal7(String animalName, String animalColor) {
		this.animalColor = animalColor;
		this.animalName = animalName;
	}
	
	public Animal7 returnObjectOfAnimal() {
		return this;
	}
	
	void printAnimalData(){
		System.out.println("Animal Name : " + animalName);
		System.out.println("Animal Color : " + animalColor);
	}
	
}

public class This_Return_Current_Object_From_Method {

	public static void main(String[] args) {
		//It can also be used to return the object of the current class from the method.
		
		new Animal7("Dog","White").returnObjectOfAnimal().printAnimalData();
		
	}
}
