package strings;

public class Exercise2_SCP_HEAP {

	public static void main(String[] args) {
		
		String g  = new String("Banana");
		g.concat("Milk");
		String r = g.concat(" egg");
		r.concat("Tomato");
		System.out.println("G : " + g + " r : "  + r);
		
		// SCP = ["Banana", "Milk", "egg", r -> "Banana egg", "Tomato",]
		// HEAP = [g -> "Banana"]
	}
}
