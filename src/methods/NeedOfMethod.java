package methods;

public class NeedOfMethod {

	public static void main(String[] args) {
		
		// Method is a collection of statements that perform a specific task and reused in other.

		// Example : 
		
		// Declare 4 name and get length of each name and print.
		String name1 = "Ajay";
		int len1 = name1.length();
		System.out.println(name1 + " length is : " + len1);
		
		String name2 = "Vijay";
		int len2 = name2.length();
		System.out.println(name2 + " length is : " + len2);
		
		String name3 = "Sanjay";
		int len3 = name3.length();
		System.out.println(name3 + " length is : " + len3);
		
		String name4 = "Jay";
		int len4 = name4.length();
		System.out.println(name4 + " length is : " + len4);
		
		// You calculated each length of name and print also.
		
		// Code duplicated 
		// not readable
		// code length is increases
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		// Types : 
		// Predefine method : Already available methods in classes
		// Ex. length() and max(), min() etc.
		
		int a = 10;
		int b = 20;
		int max = Math.max(a,b);
		System.out.println("Max : " + max);
		
		int min = Math.min(a,b);
		System.out.println("Min : " + min);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");

		// User Define method : programmer created methods for use in classes.
		
		
		
		// Two ways : 
		// instance methods : we can call methods by object of class
		// static methods:- No need to create object of classes.It is used for memory management
	}

	static int get_Length(String str) {
		return str.length();
	}
}
