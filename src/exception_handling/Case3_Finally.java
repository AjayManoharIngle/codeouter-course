package exception_handling;

public class Case3_Finally {

	public static void main(String[] args) {
		
		 // If the exception is not of type Exception1, will statement 6 and statement 5 be executed?
		
		try {
			int res1 = 10*100;
			System.out.println("Statemenet 1....");

			int res2 = 10/0;
			System.out.println("Statemenet 2....");
			
			int res3 = 10*200;
			System.out.println("Statemenet 3....");
			System.out.println(res1 + " " + res3 + " " + res2);
		}
		catch(NullPointerException ex) {
			System.out.println(ex + " error occurs at statement 2 and i am statement 4...");
		}
		finally {
			System.out.println("statemnet 6....");
		}
		System.out.println("I am statmenet 5...");
	}
}
