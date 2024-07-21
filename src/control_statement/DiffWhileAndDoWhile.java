package control_statement;

public class DiffWhileAndDoWhile {

	public static void main(String[] args) {
		
		boolean paymentStatus = false;
		int n = 5;
		
		// While loop
		int i = 1;
		while(paymentStatus && i<=n) {
			System.out.println("Print : " + i );
			i++;
		}
		System.out.println("Paymnet is status false");
		System.out.println("++++++++++++++++++++++++ ");
		
		// Do-while loop
		System.out.println("Do - While Loop - it will run body of loop at least once without checking condition");
		int j = 1;
		do{
			System.out.println("Print : " + j );
			j++;
		}while(paymentStatus && j<=n);
	}

}
