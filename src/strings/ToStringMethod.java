package strings;

class Person {
	String personName = "Ajay";
	int personAge = 24;
	
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}
}

public class ToStringMethod {

	public static void main(String[] args) {
		
		// It is used representation of string
		
		Person p = new Person();
		
		// If we not used toString method
		System.out.println("Person Name : " + p.personName);
		System.out.println("Person Age : " + p.personAge);
		
		// if we used toString method
		System.out.println(p.toString());
	}
}
