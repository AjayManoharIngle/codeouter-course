package exception_handling;

public class Case2_TryCatch {

	public static void main(String[] args) {
		
		// when u r handling wrong exception then control will goes...
		// Statement 1 ---> exception throw which is not handle run as abnormal
		
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
		System.out.println("I am statmenet 5...");
	}

}
