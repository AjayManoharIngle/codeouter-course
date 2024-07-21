package strings;

public class StringMethod17_Intend {

	public static void main(String[] args) {
		
		// Java 12 : 
		// intern -> useful to add or remove white spaces from the beginning of
		// the line to adjust indentation for each string line.
		
		String sentence1 = "Welcome to Codeouter";
		System.out.println(sentence1);
		System.out.println(sentence1.length());
		
		//If n>0 (Positive) -> Add white space to start and at last add \n
		sentence1 = sentence1.indent(2);
		System.out.println(sentence1);
		System.out.println(sentence1.length());
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		String sentence2 =  "Welcome to Codeouter";
		
		// If n == 0 -> it remains same and added at last \n
		sentence2 = sentence2.indent(0);
		System.out.println(sentence2);
		System.out.println(sentence2.length());
		System.out.println("++++++++++++++++++++++++++++++++");
		
		// if n is negative.
		// +n > white space available - remove all and add \n at last
		String sentence3 =  "   Welcome to Codeouter"; // (4 > 3)
		System.out.println(sentence3);
		System.out.println(sentence3.length());
		
		// three white spaces at start 
		sentence3 = sentence3.indent(-4);
		System.out.println(sentence3);
		System.out.println(sentence3.length());
		
		// +n < white space available - remove +n spaces and add \n at last
		String sentence4 =  "   Welcome to Codeouter";
		sentence4 = sentence4.indent(-2); // 2 < 3
		System.out.println(sentence4);
		System.out.println(sentence4.length());
	}
}
