package exception_handling;

class InvalidStudentAge extends Exception{
		
	public InvalidStudentAge(String msg) {
		super(msg);
	}
}

public class UserDefinedException extends Exception{
	
	public static void main(String[] args) {
		try {
			isStudentAllowed();
		}
		catch(InvalidStudentAge a) {
			System.out.println(a);
		}
	}

	// throws is not required
	private static void isStudentAllowed() throws InvalidStudentAge {
		int studentAge = 13;
		if(studentAge < 18) {
			throw new InvalidStudentAge("Student age is less than 18");
		}
		else {
			System.out.println("Student is allowed for party");
		}	
	}

}
