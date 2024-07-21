package exception_handling;

public class ExceptionEx {

	public static void main(String[] args) {
		
		// Exception is occurs when abnormal events happened or application interrupt between. to handle thoes events we need 
		// exception handling
		
		
		int a = 10;
		int b = 0;
		
		// Addition 
		int res1 = a+b;
		System.out.println("Addition : " + res1);
		
		// Sub
		int res2 = a-b;
		System.out.println("Sub : " + res2);
		
		// Division 
		int res3 = a/b;
		System.out.println("Division : " + res3);
		
		int res4 = a*b;
		System.out.println("Multiplication : " + res4 );
		
		// if application is stuck then ahead programs is not executing..
		// And it is not readable and not user friendly
		
	}
}
