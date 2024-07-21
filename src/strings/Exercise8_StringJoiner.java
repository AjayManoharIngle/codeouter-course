package strings;

import java.util.StringJoiner;

public class Exercise8_StringJoiner {

	public static void main(String[] args) {
		
		// Print : {[a:10],[b:12]}
		
		StringJoiner s1 = new StringJoiner(":","[","]");
		s1.add("a");
		s1.add("10");
		System.out.println(s1);
		
		StringJoiner s2 = new StringJoiner(":","[","]");
		s2.add("b");
		s2.add("12");
		System.out.println(s2);
		
		StringJoiner s3 = new StringJoiner(",","{","}");
		s3.add(s1.toString());
		s3.add(s2.toString());
		System.out.println("Print : " + s3);
	}
}
