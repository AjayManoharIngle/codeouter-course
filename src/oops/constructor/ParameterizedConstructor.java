package oops.constructor;

class Person5{
	
	String name;
	int age;
	
	public Person5(String personName, int personAge) {
		name = personName;
		age = personAge;
	}
	
	void printPersonData() {
		System.out.println("Person Name : " + name);
		System.out.println("Person Age : " + age);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		// Parameter constructor - initialize objects data when objects created for multiple objects 
		// different values.
		
		Person5 person1 = new Person5("Ajay",24);
		Person5 person2 = new Person5("Vijay", 34);
		
		person1.printPersonData();
		person2.printPersonData();

	}
}

