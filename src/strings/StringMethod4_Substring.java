package strings;

public class StringMethod4_Substring{

	public static void main(String[] args) {
		
		// substring - returns substring starting from specified index.
		
		String name = "Ajay";
		// [A,j,a,y] -> [0,1,2,3]
		
		String name1 = name.substring(2);
		String name2 = name.substring(1,3); // (start, end-1) => [1,2]
		System.out.println(name1 + " " + name2);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// Ex. print subpart of string 
		// abc => [a,b,c,ab,bc,abc]
		String str = "abc";
		subsetOfSubstring(str);
	}

	private static void subsetOfSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String subset = str.substring(i,j);
				System.out.println(subset);
			}
		}
	}
}
