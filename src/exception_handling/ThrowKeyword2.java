package exception_handling;

public class ThrowKeyword2 {

	public static void main(String[] args) {
		
		// Those student allowed who age greater than 18 
		
		int studentAge = 13;
		try {
			if(studentAge < 18) {
				throw new ArithmeticException("Student Age is less than 18");
			}
			else {
				System.out.println("Student is allowed for party");
			}
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
	}

}
