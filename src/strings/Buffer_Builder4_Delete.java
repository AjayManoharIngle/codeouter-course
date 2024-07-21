package strings;

public class Buffer_Builder4_Delete {

	public static void main(String[] args) {
		
		// Delete -> StringBuilder class deletes the string from the specified beginIndex to endIndex.
		
		StringBuffer buffer = new StringBuffer("Ajay Manohar Ingle");
		
		// delete a part of string - [start,end-1]
		buffer.delete(5,12);
		System.out.println(buffer);
		
		// delete a character from string
		buffer.deleteCharAt(5);
		System.out.println(buffer);		
		
		StringBuilder builder = new StringBuilder("Ajay Manohar Ingle");
		
		// delete a part of string - [start,end-1]
		builder.delete(5,12);
		System.out.println(builder);
		
		// delete a character from string
		builder.deleteCharAt(5);
		System.out.println(builder);	
	}
}
