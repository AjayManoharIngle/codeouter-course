package operators;

public class OperatorsConcept {

	public static void main(String[] args) {
		
		//Operators in Java are symbols that perform operations on operands. 
		//Operands can be variables, literals, or expressions.
		
		// 1.Arithmetic Operators: Arithmetic operators are used to perform add, sub, mul, div.
		int a = 10, b = 4;

		int sum = a + b;      // Addition
		int difference = a - b; // Subtraction
		int product = a * b;   // Multiplication
		int quotient = a / b;  // Division
		int remainder = a % b; // Modulus (remainder after division)

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 2. Relational Operators: has comparison and equality
		int x = 5, y = 8;

		boolean isEqual = (x == y);   // Equal to
		boolean notEqual = (x != y);   // Not equal to
		boolean greaterThan = (x > y); // Greater than
		boolean lessThan = (x < y);    // Less than
		boolean greaterOrEqual = (x >= y); // Greater than or equal to
		boolean lessOrEqual = (x <= y);    // Less than or equal to

		System.out.println("Is Equal: " + isEqual);
		System.out.println("Not Equal: " + notEqual);
		System.out.println("Greater Than: " + greaterThan);
		System.out.println("Less Than: " + lessThan);
		System.out.println("Greater or Equal: " + greaterOrEqual);
		System.out.println("Less or Equal: " + lessOrEqual);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		// 3. Logical Operators: It returns the true and false.
		boolean p = true, q = false;

		boolean andResult = p && q; // Logical AND
		boolean orResult = p || q;  // Logical OR
		boolean notResult = !p;     // Logical NOT

		System.out.println("Logical AND: " + andResult);
		System.out.println("Logical OR: " + orResult);
		System.out.println("Logical NOT: " + notResult);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		// 4. Assignment Operators: assigned value to a variable.
		int num = 5;

		num += 3; // Equivalent to num = num + 3
		num -= 2; // Equivalent to num = num - 2
		num *= 4; // Equivalent to num = num * 4
		num /= 2; // Equivalent to num = num / 2

		System.out.println("Updated Value: " + num);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 5. Unary Operators :  needs only one operand to perform any operation 
		int count = 10;

		// post fix  = data assigned to variable first and after that operation performed.
		count++; // Increment by 1
		count--; // Decrement by 1
		System.out.println("POST : count - " + count);
		
		// Pre fix = first oprations performed and after that assigned in varibale.
		++count; // Increment by 1
		--count; // Decrement by 1
		System.out.println("PRE : count - " + count);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// 6. Bitwise Operators :  three things – (&, |, ^) it is return value after operation.
		int e = 10;
	    int f = 20;
	    
	    int andBit = e & f; 
//	    e = 01010
//	    f = 10100
//	    r = 00000
	    System.out.println(andBit);
	    
	    int orBit = e | f;
//	    e = 01010
//	    f = 10100
//	    r = 11110 => 0*2^0 + 1*2^1 + 1*2^2 + 1*2^3 + 1*2^4 = 0+2+4+8+16 = 30
	    System.out.println(orBit);

	    int xorBit = e ^ f;
//	    e = 01010
//	    f = 10100
//	    r = 11110
	    System.out.println(xorBit);
	    
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    
	    //7. Ternary Operators : the conditional operator.
	    int i = 10;
        int j = 20;
        int res = (i > j) ? i : j;
        System.out.println("Ternary : " + res); 
	}

}
