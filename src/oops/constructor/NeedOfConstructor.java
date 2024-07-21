package oops.constructor;

class Person1{
	
	String name;
	int age;
	
	void setPersonData(String personName, int personAge) {
		name = personName;
		age = personAge;
	}
	
	void printPersonData() {
		System.out.println("Person Name : " + name);
		System.out.println("Person Age : " + age);
	}
}

public class NeedOfConstructor {

	public static void main(String[] args) {
		
		// Constructor is a way to initialize objects not to create an object.
		
		// Rules :
		// 1. Constructor name must be the same as its class name
		// 2. A Constructor must have no explicit return type
		// 3. A Java constructor cannot be use abstract, static, final, and synchronized keyword.
		
		// Without using constructor : 
		// To initialize data of person and print their details :
		
		Person1 person = new Person1();
		person.setPersonData("Jay",24);
		person.printPersonData();
		
		Person1 person1 = new Person1();
		person1.setPersonData("Ajay",34);
		person1.printPersonData();
		
		// Disadvantages : 
		// 1. data is set using a method (setPersonData) after creating the object of person.
		// 2. object initialization requires multiple steps (creating an object, then setting data).
		// 3. Constructors can improve code clarity by clearly defining how objects should be initialized 
		//    and reducing the need for separate initialization methods.
		
	}
}
