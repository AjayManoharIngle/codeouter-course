package strings;

public class Exercise4_String1 {

	public static void main(String[] args) {
		
		// To check string is Palindrome String => 
		// radar = yes
		// Radar = yes
		// ajay = no
		
		String str = "radaR";
		
		// Method 1 : 
		int j = str.length()-1;
		Boolean status = false;
		for(int i=0; i<=j;i++) {
			if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
				System.out.println(str + " is not palindrome string.");
				status = true;
				break;
			}
			j--;
		}
		if(status==false) {
			System.out.println(str + " is palindrome string.");
		}
		
		// Method 2 : 
		int len = str.length()-1;
		String res = "";
		for(int i=len; i>=0;i--) {
			res = res + str.charAt(i);
		}
		if (str.toLowerCase().equals(res.toLowerCase())) {
			System.out.println(str + " is palindrome string.");
		}
		else {
			System.out.println(str + " is not palindrome string.");
		}
	}
}
