package exception_handling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		// finally with try catch block 
		
		try {
			int res1 = 10*100;
			System.out.println("Statemenet 1...." + res1);
			
			int res2 = 10/0;
			System.out.println("Statemenet 2...." + res2);
			
			int res3 = 10*2;
			System.out.println("Statemenet 3...." + res3);
			
		}
		catch(Exception ex) {
			System.out.println(ex + " error occurs at statement 2 and i am statement 4...");
		}
		finally {
			System.out.println("Statement 6......");
		}
		System.out.println("I am statmenet 5...");
	}

}
