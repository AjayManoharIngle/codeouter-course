package datatypes;

public class Exercise1_PrimitiveDataType {

	public static void main(String[] args) {
		
		// Take byte and short any number and do addition.
		// Store result to sum1 and again take long no and add with sum1
		// Store result to sum2 and again take float no and add with sum2 
		// Store result to sum3 and again take double no and add with sum 3
		// Store result to sum4
		// Print all sums.
				
		byte a = 10; 
		short b = 100;

		int sum1 = a+b; // int large than byte and sum.
		
		long c = 1000L;
		long sum2 = sum1 + c; // long larger than int
		
		float d = 99.9f;
		float sum3 = sum2+d; // float is larger than long as long is 8 byte and float is 4 byte 
		
		double e = 100.99d;
		double sum4 = sum3 + e; // double is larger than float
		
		System.out.println(sum1 + "  " + sum2 + " " + sum3 + " " + sum4);
	}

}
