package datatypes;

public class ImplicitConversions {

	public static void main(String[] args) {
		
		//The destination type is larger than the source type. 
		//It is automatic conversion from one type to other.
		
		// byte is convert to int
		// destination = int and source = byte => (4 byte > 1 byte)
		
		byte a = 10;
		int b = a;
		
		// int is convert to long
		// destination = long and source = int => (8 byte > 4 byte)
		int c = 100;
		long d = c;
		
		// long is convert to float
		// destination = float and source = long => (4 byte < 8 byte) 
		// But float can hold many data as compare to long before decimal.
		long e = 1000L;
		float f = e;
		
		// float is convert to double => (8 byte > 4 byte)
		float g = 99.8f;
		double h = g;
		
		// Not get any complie time error.
	}
}
