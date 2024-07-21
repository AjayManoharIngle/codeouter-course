package strings;

public class Buffer_Builder7_Substring {

	public static void main(String[] args) {
		
		// Substring -> It is used to return the substring from the specified beginIndex.
		// It is used to return the substring from the specified beginIndex and endIndex.

		
		StringBuffer buffer = new StringBuffer("Ajay");
		
		// To get substring from start to till last index.
		String begStr = buffer.substring(1);
		System.out.println(begStr);
		
		// To get substring from start to till last index.
		String begEndStr = buffer.substring(1,2); // [start, end-1]
		System.out.println(begEndStr);	
		
		StringBuilder builder = new StringBuilder("Ajay");
		
		// To get substring from start to till last index.
		String begStr1 = builder.substring(1);
		System.out.println(begStr1);
		
		// To get substring from start to till last index.
		String begEndStr1 = builder.substring(1,2); // [start, end-1]
		System.out.println(begEndStr1);	
	}
}
