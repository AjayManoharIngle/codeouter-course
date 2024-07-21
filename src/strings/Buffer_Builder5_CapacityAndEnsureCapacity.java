package strings;

public class Buffer_Builder5_CapacityAndEnsureCapacity {

	public static void main(String[] args) {
		
		// Capacity -> It is used to return the current capacity.
		
		// Default = 16 => 16+4 = 20
		StringBuffer buffer = new StringBuffer("Ajay");
		System.out.println(buffer.capacity());
		
		// new  = (old+1)*2 => (20+1)*2 = 42
		buffer.append("Ajay Manohar Ingle");
		System.out.println(buffer.capacity());
		 
		// Ensure Capacity : ensures that the given capacity is the minimum to the current capacity
		// If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2.
		
		// 42+1 = 43 => 43*2 = 86
		buffer.ensureCapacity(50);
		System.out.println(buffer.capacity());
		
		StringBuilder builder = new StringBuilder("Ajay");
		System.out.println(builder.capacity());
		
		builder.append("Ajay Manohar Ingle");
		System.out.println(builder.capacity());
		
		builder.ensureCapacity(50);
		System.out.println(builder.capacity());
		
	}
}
