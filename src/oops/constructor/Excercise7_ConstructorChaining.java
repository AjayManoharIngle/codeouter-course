package oops.constructor;

public class Excercise7_ConstructorChaining {
	
	 int a;
	 int b;

	 Excercise7_ConstructorChaining(int a, int b){
		 this(a+b);
		 this.a = a;
		 this.b = b;
	 }
	 
	 Excercise7_ConstructorChaining(int sum){
		 System.out.println("Sum of two no : " + sum );
	 }
	
	public static void main(String[] args) {
		// identity output 
		new Excercise7_ConstructorChaining(10,20);
	}
}
