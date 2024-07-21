package strings;

public class StringMethod13_TrimAndStrip {

	public static void main(String[] args) {
		
		// trim -> eliminates leading and trailing spaces.
		
		String name1 = "  Ajay      ";
		System.out.println("Before trim length of name : " + name1.length());
		
		name1 = name1.trim();
		System.out.println("After trim length of name : " + name1.length());
		
		// Ex. check it is contains white spaces or not
		
		String name2 = "   a";
		if(name2.trim().length() > 0)
			System.out.println("String contains characters other than white spaces.");
		else if(!name2.equals(""))
			System.out.println("String contains white spaces only");
		else 
			System.out.println("String is empty");
		
		// strip -> eliminates leading and trailing space individually or together.

		String name3 = "  Vijay   ";
		System.out.println("Name3 Length : " + name3.length());
		
		// remove leading white spaces in string
		name3 = name3.stripLeading();
		System.out.println("Name3 Length lead strip : " + name3.length());
		
		// remove trailing white spaces in string
		name3 = name3.stripTrailing();
		System.out.println("Name3 Length trail strip : " + name3.length());
		
		name3 = "     Vijay       ";
		name3 = name3.strip();
		System.out.println("Only strip both: " + name3.length());

		// from java 15 it's called as text block
		String str = """
				Welcome to 
				      codeOuter course
				learn java.
				""";
		
		System.out.println(str.stripIndent());
	}
}
