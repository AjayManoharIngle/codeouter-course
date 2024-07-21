package oops.constructor;

class Person2{
	
	String name;
	int age;
	
	//We are not creating any constructor. So, Java Compiler will automatically insert a default constructor. 
	
	void printPersonData() {
		System.out.println("Person Name : " + name);
		System.out.println("Person Age : " + age);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		
		// Default constructor - JVM will initialize objects not create objects
		
		// Default - all objects values identical to all objects.

		Person2 person1 = new Person2();
		person1.printPersonData();
		
		Person2 person2 = new Person2();
		person2.printPersonData();
	}
}



