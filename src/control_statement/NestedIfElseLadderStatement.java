package control_statement;

public class NestedIfElseLadderStatement {

	public static void main(String[] args) {
		
		// Nested If-else ladder Statement :We have check multiple conditions one after another with two possibilities with ladder.
		
		// Task : 
		// 1. You have vending machine where you can find your choice of item based on note you inserted.
		// 2. If 10 ruppes - Chips, 20 ruppes - Snickers, 50 ruppes - Dairy Milk 
		
		boolean paymentStatus = true;
		int noteInserted = 50;
		
		if(paymentStatus) {
			if(noteInserted==10) {
				System.out.println("You will Chips packet.");
			}else if(noteInserted==20) {
				System.out.println("You will Snickers");
			}else if(noteInserted==50) {
				System.out.println("You will Dairy Milk");
			}else {
				System.out.println("Please insert note first.");
			}
		}
		else {
			System.out.println("Error while processing payment.");
		}
	}
}
