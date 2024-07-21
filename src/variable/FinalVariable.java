package variable;

public class FinalVariable {

	public static void main(String[] args) {
		// Final Variables:
		// - Final variables are constants and cannot be changed once assigned.
				
		int NO_OF_STUDENTS = 100;
		System.out.println("Without final no of students : " + NO_OF_STUDENTS);
		NO_OF_STUDENTS = 200;
		System.out.println("Without final no of students changed : " + NO_OF_STUDENTS);

				
		final int NO_OF_STUDENTSS = 100;
		System.out.println("With final no of students : " + NO_OF_STUDENTSS);
		//NO_OF_STUDENTSS = 300; // complie time error
	}

}
