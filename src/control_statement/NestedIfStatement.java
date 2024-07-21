package control_statement;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		//Nested If Statement : We have check multiple conditions one after another 
		// and you to change something after one codition.
		
		// Task 1 : If number is positive then only check number is even or not.
		int no = 122;
		if(no > 0) {
			if(no % 2 == 0) {
				System.out.println(no + " is positive and even both.");
			}
		}
		
		// Other way to write in single IF
		if(no > 0 && no%2==0) {
			System.out.println(no + " is positive and even both.");
		}
		
		// Task 2 : If number is negative then make it positive and check is divisible by 5 or not.
		int n = -95;
		if(n < 0) {
			n = -n;
			if(n > 0  && n%5==0) {
				System.out.println("Number is positive and divisble by 5");
			}
		}

		// Task 3 : If second name is having 4 character then only check first name is equal with second name.
		String firstname = "Ajay";
		String secondname = "Ajay";
		if(firstname.length() == 4) {
			if(secondname.equals(firstname)) {
				System.out.println("Both Names are equal.");
			}
		}
	}
}
