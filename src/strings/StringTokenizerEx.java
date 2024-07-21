package strings;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// It is class allows you to break a String into tokens. It is simple way to break a String
		// hasMoreToeken, nextToken, nextToken(delim), countToken,nextElements, hasMoreElements
		
		StringTokenizer s = new StringTokenizer("Ajay Manohar Ingle");
		// space is by default delimiter
		// Split into tokens
		// hasMoreTokens - Returns true if there are more tokens in 
		// the string after the current position; otherwise, returns false
		// nextToken - Returns the next token from the string.
		

		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
		
		StringTokenizer st = new StringTokenizer("Jay-Shree-Ram","-");
		
		// hasMoreEle - it uses with enumeration with objets same as tokens only.
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		StringTokenizer sn = new StringTokenizer("Ajay,Manohar,Ingle");
		// nextToken("delimeter") -print next ele of delimeter
		System.out.println("Next token : " + sn.nextToken(","));
		
		// countToken -> Returns the total number of tokens remaining in the string after the current position.
		System.out.println("Token count : "  + sn.countTokens());
		
	}
}
