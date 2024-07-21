package datatypes;

class Person{
	String personName;
	int personAge;
	
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}
	
}

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		//Non-primitive data types in Java, also known as reference types, are data types that 
		//don't store the actual values directly but instead store references (memory addresses) 
		//to the objects.
		
		//Objects are created in the heap memory, and the reference is stored in the stack.
		
		// Ex. UserDefined Classes, Array and string etc.
		
		// Stack : person1 -> Heap = [Person(personAge : 21, personName : Ajay)]
		Person person1 = new Person();
		person1.personAge = 21;
		person1.personName = "Ajay";
		
		// Now Stack has same memory address of person1 to person2 so points to same.
		// Stack : person2 -> Heap = [Person(personAge : 21, personName : Ajay)]
		// After Changing data
		// Stack : person1,person2 -> Heap = [Person(personAge : 22, personName : Vijay)]
		Person person2 = person1;
		person2.personAge = 22;
		person2.personName = "Vijay";
		
		System.out.println(person1);
		System.out.println(person2);

	}
}
