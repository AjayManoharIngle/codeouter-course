package oops.constructor;

class Person3{
	
	String name;
	int age;
	
	public Person3(){
		name = "Ajay";
		age = 35;
	}
	
	void printPersonData() {
		System.out.println("Person Name : " + name);
		System.out.println("Person Age : " + age);
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		
		// Non Parameterized - We create constructor and initialize 
		// objects value but without parameter
		
		// non parameter - all objects values identical to all objects.
		
		Person3 person1 = new Person3();
		person1.printPersonData();
		
		Person3 person2 = new Person3();
		person2.printPersonData();
	}
}
