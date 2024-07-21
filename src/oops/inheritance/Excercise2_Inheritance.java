package oops.inheritance;

class Animals{
	String animalName;
	String nickName;
	String voice ;
	
	public void makeSound(String nickName, String voice) {
		this.nickName = nickName;
		System.out.println(nickName + " is doing " + voice);
	}
}

// Single inheritance
class Dogs extends Animals{
	
	public Dogs() {
		super.makeSound("Sheru","Barking");
	}
	
	public String dogSound(String color) {
		return color;
	}
}

// Hierarchical
class Cats extends Animals{
	
	public Cats() {
		super.makeSound("kitti","Meuwwwoo");
	}
}

// MultiLevel 

class PuppyDog extends Dogs{
	
	PuppyDog(){
		System.out.println("Puppy has " + super.dogSound("Brown") + " color. ");
	}
}

public class Excercise2_Inheritance {
	
	// Problem : Animal is parent class - animal name, nickname
	// Cat and Dog and Rat is child of parent
	// implement - Single,Multilevel,Hierarchical

	public static void main(String[] args) {
		
		Animals dog = new Dogs();
		Animals cat = new Cats();
		Animals pDog = new PuppyDog();
	}
}
