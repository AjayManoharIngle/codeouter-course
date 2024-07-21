package oops.constructor;

class Person4{
	
	String name1;
	int age1;
	
	String name2;
	int age2;
	
	Person4(){
		name1 = "Ajay";
		age1 = 23;
		
		name2 = "Vijay";
		age2 = 34;
	}
	
	void printPerson1Data() {
		System.out.println("Person Name : " + name1);
		System.out.println("Person Age : " + age1);
	}
	
	void printPerson2Data() {
		System.out.println("Person Name : " + name2);
		System.out.println("Person Age : " + age2);
	}
}

public class Excercise2_Non_Parameter_Constructor {

	public static void main(String[] args) {
		
		// We want 2 person details and print using constructor
		
		Person4 person1 = new Person4();
		person1.printPerson1Data();
		
		Person4 person2 = new Person4();
		person2.printPerson2Data();
		
	}
}
