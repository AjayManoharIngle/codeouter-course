package inputs_taken_from_system;

public class Exercise3_CommandLineArgs {

	public static void main(String[] args) {
		
		// Create your own password.
		// take 5 character's from command line and join to make password
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		
		String password = a+b+c+d+e;
		System.out.println("Your passoward : " + password);
		
	}
}
