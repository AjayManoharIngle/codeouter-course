package datatypes;

public class ExplicitConversions {

	public static void main(String[] args) {
		
		//The destination type is smaller than the source type.
		//It is not doing automatically need write type for conversion.
		
		// int is converted to byte
		// destination = byte and source = int => (1 byte < 4 byte)
		int a = 10;
		byte b = (byte) a;
		
		// long is convert to int
		// destination = int and source = long => (4 byte < 8 byte)
		long c = 100;
		int d = (int) c;
		
		// float is convert to long
		// destination = long and source = float => (8 byte > 4 byte) 
		// But float can hold many data as compare to long before decimal.
		float e = 1000.9f;
		long f = (long) e;
		System.out.println(f);
		
		// double is convert to float => (4 byte <  8 byte)
		double g = 99.8f;
		float h = (float) g;
				
		// Compile time error to avoid we added type casting.
	}

}
