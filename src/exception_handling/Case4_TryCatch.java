package exception_handling;

public class Case4_TryCatch {

	public static void main(String[] args) {
		
		// if no exception then no catch block is run
	
		try {
			int res1 = 10*100;
			System.out.println("Statemenet 1...." + res1);
			
			int res2 = 10/10;
			System.out.println("Statemenet 2...." + res2);
			
			int res3 = 10*200;
			System.out.println("Statemenet 3...." + res3);
			
		}
		catch(Exception ex) {
			System.out.println(ex + " error occurs at statement 2 and i am statement 4...");
		}
		System.out.println("I am statmenet 5...");
		
	}

}
