package oops.polymorphism;

class Animal { 
	void eat() 
	{ 
	   System.out.println("Animals eat animals.."); 
	 } 
} 
class Lion extends Animal { 
	void eat() 
	{ 
	    System.out.println("Lions eat other animal.."); 
	} 
} 

public class DynamicBinding {
	
	// Dynamic binding - run time check object level  - late binding - method overriding, 

	public static void main(String[] args) {
		
		Animal a = new Animal(); // a is point to animal eat
		a.eat();
		
		Animal al = new Lion(); // al is point Lion eat 
		al.eat();
	}
}
