package strings;

public class Buffer_Builder3_Replace {

	public static void main(String[] args) {
		
		// replace -> method replaces the given string from the specified beginIndex and endIndex.
		
		StringBuffer buffer = new StringBuffer("Ajay Manohar Ingle");
		
		// It replace characters from start to end in string
		buffer.replace(5,11,"Vijay");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Ajay Manohar Ingle");
		
		// It replace characters from start to end in string
		builder.replace(5,11,"Vijay");
		System.out.println(builder);
		
	}
}
