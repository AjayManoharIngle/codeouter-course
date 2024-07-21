package exception_handling;

public class Try_Catch_Ex {

	public static void main(String[] args) {
		
		// exception will occurs during division so will write try catch block there
		
		int a = 10;
		int b = 0;
		
		// Addition 
		int res1 = a+b;
		System.out.println("Addition : " + res1);
		
		// Sub
		int res2 = a-b;
		System.out.println("Sub : " + res2);
		
		// Division 
		try {
			int res3 = a/b;
			System.out.println("Division : " + res3);
		}
		catch(Exception ex) {
			System.out.println(ex + " : You are not allowed to divide any number by zero");
		}
		
		int res4 = a*b;
		System.out.println("Multiplication : " + res4 );
	}

}
