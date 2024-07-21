package strings;

public class StringMethod14_Join {

	public static void main(String[] args) {
		
		// Join -> returns a string joined with a given delimiter.
		
		String name = "Ajay";
		String name1 = String.join("-",name,"Manohar","Ingle");
		System.out.println(name1);
		
		// if your string is null 
		String name2 = String.join("-",name,null,"Ingle");
		System.out.println(name2);
		
		// if your delimeter is null - NullpointerException
//		String name3 = String.join(null,name,"Ingle");
//		System.out.println(name3);
		
		// if your string is null for storing initially
		String str = null;
		str = String.join("/",name,"Ingle");
		System.out.println(str);
	}
}
