package variable;

public class VariableConcept {

	public static void main(String[] args) {
		
		// Variable : 
		//- It is a container that holds data values.
		//- It is way to name memory location.
		
		int i =10;
		// i = variable name
		// 10 is value which is store in variable.
		
		// Declaration of variable: 
		int a; // not having any value.
		
		// Initialization of variable:
		a = 20; // value assigned to variable.
		
		// Declaration & Initialization both in one line.
		// int a = 20;
		
		// Printing variable
		System.out.println("Variable a holds value : " + a);
		
		// Variable naming conventions :
		// - Use meaningful names that reflect the purpose of the variable.
		int age = 21;
		System.out.println("Age of person is : " + age);
		
		// Variable expressions : 
		int sum = 1+2;
		System.out.println("Sum : " + sum);
		
		int mul = 3*4;
		System.out.println("Mul : " + mul);
	}
}
