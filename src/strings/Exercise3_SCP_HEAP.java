package strings;

public class Exercise3_SCP_HEAP {

	public static void main(String[] args) {
		
		String f = "Ajay"; 
		String h = new String(f);
		h.concat("Manohar");
		String i = h.concat(f);
		i.concat(h);
		System.out.println("i -> " + i + " h -> " + h);
		
		// SCP = ["Ajay", i -> "AjayAjay"]
		// HEAP = [h->"Ajay"]
	}
}
