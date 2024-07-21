package control_statement;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		
		// Nested If-else Statement : We have check multiple conditions one after another with two possibilities.

		// Task : firstname should have 5 chracter,change firstname by secondname,check equal both
		String firstName = "Ajay";
		String secondName = "Vijay";
		
		if(firstName.length() == 5) {
			firstName = secondName;
			if(firstName.equals(secondName)) {
				System.out.println("Both are now same.");
			}
		}
		else {
			System.out.println("First name is not have 5 charcter.");
		}
	}
}
