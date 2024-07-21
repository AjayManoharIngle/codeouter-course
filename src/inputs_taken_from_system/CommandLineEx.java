package inputs_taken_from_system;

public class CommandLineEx {

	public static void main(String[] args) {

		//The args parameter in the main method is an array of strings 
		//(String[]) that holds these command-line arguments.
		
		// Eclipse : Go to run As -> Run configuration -> Arguments -> Program Arguments -> 1 2 3
		// Intellj : Run -> Edit configuration - program arguments 
		// Or 
		// java CommandLineEx.java aregs fjf ff
		 System.out.println("First argument : " + args[0]);
		 System.out.println("Second argument : " + args[1]);
		 System.out.println("Third argument : " + args[2]);
		 
	}

}
