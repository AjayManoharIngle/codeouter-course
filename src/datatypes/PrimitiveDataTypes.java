package datatypes;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		// Data Types : define the type of data a variable can hold 
		// and the operations that can be performed on it.
		
		// Two Types: Primitive and Non primitive data types
		
		// Primitive data types:
		// - Stored directly in memory,Occupy a fixed amount of memory.
		
		// Integral : byte, short, int, long
		
		// byte : 1 byte=8 bits and -128 to 127 and default=0
		byte stu_age = 10;
		//age = -129; // not allowed
		//age = 128;  // not allowed
		
		// short : 2 byte = 16 bits and -32768 to 32767 and default=0
		short stu_coins = 31000;
		//coins = 32768; // not allowed
		//coins = -32769; // not allowed
		
		//int : 4 byte = 32 bits and -2147483648 to 2147483647 and default=0 => 8 zero's allowed = 210 CR
		int stu_amount=100;
		//amount=21000000000; //not allowed
		//amount=-21000000000; // not allowed
		
		//long :8 byte = 64 bits , -10^18 to 10^18 and default=0L => 18 zero's allowed.
		long stu_bigAmount=9000L; 
		//bigAmount=90000000000000000000L;
		//bigAmount=-90000000000000000000L;
		
		//float : 4 byte = 32 bits and default=0.0f and 38 zero's allowed only
		float stu_marks = 99.99f;
		//marks = 1000000000000000000000000000000000000400.9f;
		//marks = -1000000000000000000000000000000000000400.9f;
		
		//double : 8 byte = 64 bits and default=0.0d
		double stu_stocks = 308.9999999d;
		
		//char : 2 byte = 16 bits and default=\u0000;
		char stu_division = '\u0000';
		stu_division = 'A';
		
		
		// boolean : 1 bit and have true ,false value [0,1]
		boolean stu_pass = true;
		
		System.out.println("Age : " + stu_age);
		System.out.println("Coins : " + stu_coins);
		System.out.println("Amount : " + stu_amount);
		System.out.println("Big Amount : " + stu_bigAmount);
		System.out.println("Marks : " + stu_marks);
		System.out.println("Stocks : " + stu_stocks);
		System.out.println("Division : " + stu_division);
		System.out.println("Status : " + stu_pass);

	}
}
