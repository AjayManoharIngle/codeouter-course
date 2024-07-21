package strings;

public class Exercise7_StringBuilder {

	public static void main(String[] args) {
		
		String str = "ajay ingle"; // To check vowels present 
		
		// count vowels
		StringBuilder sb = new StringBuilder(str);
		
		Boolean status = false;
		for(int i=0;i<sb.length();i++) {
			char j = sb.charAt(i);
			if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u' || 
					j=='A' || j=='E' || j=='I' || j=='O' || j=='U') {
				status = true;
				break;
			}
		}
		if(status) {
			System.out.println("Vowels is present");
		}
		else {
			System.out.println("Vowels is not present");
		}
	}
}
