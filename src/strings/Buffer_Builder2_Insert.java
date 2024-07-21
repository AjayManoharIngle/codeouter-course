package strings;

public class Buffer_Builder2_Insert {

	public static void main(String[] args) {
		
		// insert -> used to insert the specified string with this string at the specified position.
		
		StringBuffer buffer = new StringBuffer("Ajay");
		buffer.insert(1,"Ingle");
		System.out.println(buffer);
		
		// offset -> start from index 4 to insert in buffer
		// 2 - start index of string
		// 5 - end index of string i.e 5-1 = 4 index
		buffer.insert(4, "Manohar", 2, 5);
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Ajay");
		builder.insert(1,"Ingle");
		System.out.println(builder);
		builder.insert(4, "Manohar", 2, 5);
		System.out.println(builder);
		
	}
}
