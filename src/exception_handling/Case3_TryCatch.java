package exception_handling;

public class Case3_TryCatch {

	public static void main(String[] args) {
		
		// exception is occurs inside catch block ..has statement 4  and 2 not executing..
		
		try {
			int res1 = 10*100;
			System.out.println("Statemenet 1...." + res1);
			
			int res3 = 10*200;
			System.out.println("Statemenet 3...." + res3);
			
		}
		catch(Exception ex) {
			
			int res2 = 10/0;
			System.out.println("Statemenet 2...." + res2);
			
			System.out.println(ex + " error occurs at statement 2 and i am statement 4...");
		}
		System.out.println("I am statmenet 5...");
	}
}
