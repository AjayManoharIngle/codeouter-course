package exception_handling;

public class ThrowsKeyword2 {

	public static void main(String[] args) {
		try {
			isStudentAllowed();
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
	}

	// throws is not required
	private static void isStudentAllowed() {
		int studentAge = 13;
		if(studentAge < 18) {
			throw new ArithmeticException("Student Age is less than 18");
		}
		else {
			System.out.println("Student is allowed for party");
		}	
	}

}
