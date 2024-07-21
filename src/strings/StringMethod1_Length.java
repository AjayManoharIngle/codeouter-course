package strings;

public class StringMethod1_Length {
	
	public static void main(String[] args) {
		
		// length() -> return length of string.
		
		String name = "Ajay";
		int len = name.length();
		System.out.println("Name length : " + len);
		
		// It counts white space as well.
		String name1 = "Ajay Ingle";
        System.out.println(name1.length());
        
        String name2 = "";
        String name3 = " ";
        System.out.println(name2.length() + " " + name3.length());
        
        // We can't find length if string is null
        String name4 = null;
        System.out.println(name4.length());
	}
}
