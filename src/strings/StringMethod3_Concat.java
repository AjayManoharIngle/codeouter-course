package strings;

public class StringMethod3_Concat {
	
	public static void main(String[] args) {
		
		// concat() -> returns concatenates the specified string to the end of the current string.
		
		// create full name
		String name = "Ajay";
		name.concat("Ingle");
		System.out.println("Full Name : " + name);
		
		String name1 = name.concat(" Thakur");
		System.out.println("Full Name : " + name1);
		
		// other way : 
		String name2 = name + " " + "Thakur";
		System.out.println("Full Name : " + name2);
		
		// concat two or more strings..
		String name3 = name.concat(" Manohar").concat(" Ingle");
		System.out.println("Full Name : " + name3);
		
		// Mix + with concat 
		String name4 = name.concat(" 123 ")+" 456 " + name.concat(" 789 " + "10");
		System.out.println("Full Name with number : " + name4);
		
		// + uses with integer and string
		String a = "100";
		String b = "200";
		int c = 100;
		int d = 200;
		System.out.println(a+b + " " + (c+d));
		
		// String with integer
		String e = a+c;
		System.out.println(e);
		System.out.println("Value : " + c+d);
	}
}
