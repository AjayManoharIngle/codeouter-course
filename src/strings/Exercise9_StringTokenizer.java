package strings;

import java.util.StringTokenizer;

public class Exercise9_StringTokenizer {

	public static void main(String[] args) {
		
		String no = "10 20 30 40 50";
		
		// Sum of all integer in string
		
		StringTokenizer st = new StringTokenizer(no);
		
		int sum =0;
		while(st.hasMoreTokens()) {
			sum = sum + (Integer.parseInt(st.nextToken()));
		}
		
		System.out.println("Sum : " + sum);
		
		StringTokenizer sp = new StringTokenizer(no);
		// using for loop
		int s =0;
		for(;sp.hasMoreTokens();) {
			s += (Integer.parseInt(sp.nextToken()));
		}
		System.out.println("Sum : " + s);
	}
}
