package strings;

public class Exercise1_SCP_HEAP {

	public static void main(String[] args) {
		
		// Predicate output and understand heap and SCP concepts.
		
		String a = "Ajay";
		String b = "Ajay";
		// SCP = [a,b -> "Ajay"] [JVM will create only one objects if it is already exists]
		
		String m = new String("Ajay");
		String n = new String("Ajay");
		// SCP = [m,n -> "Ajay"]
		// Heap = [m->"Ajay", n->"Ajay"]
	}
}
