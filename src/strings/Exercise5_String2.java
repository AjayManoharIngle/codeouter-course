package strings;

public class Exercise5_String2 {

	public static void main(String[] args) {
		
		// Reverse words from sentences
		// str = "welcome to Java" => "emoclew ot avaJ"
		
		String str = "welcome to Java";
		
		String words = "";
		String revSentence = "";
		int i =0;
		int len = str.length()-1;
		while(i<=len) {
			if(str.charAt(i) != ' ') {
				words = words + str.charAt(i);
			}
			else {
				revSentence = revSentence+reverse(words)+" ";
				words = "";
			}
			i++;
		}
		revSentence = revSentence+reverse(words)+" ";
		
		System.out.println(revSentence);
	}

	private static String reverse(String words) {
		String rev = "";
		for(int i=words.length()-1;i>=0;i--) {
			rev = rev + words.charAt(i);
		}
		return rev;
	}
}
