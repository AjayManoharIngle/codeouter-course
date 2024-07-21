package control_statement;

public class WhileLoop {

	public static void main(String[] args) {
		
		//The while loop repeatedly executes a block of code as long as a given condition is true.
		
		// 1. Print Numbers from 1 to 5:
		int i = 1;
		while (i <= 5) {
		    System.out.println(i);
		    i++;
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		
		// 2. Calculate the Sum of Numbers from 1 to 5:
		int sum = 0;
		int j = 1;
		while (j <= 5) {
		    sum += j;
		    j++;
		}
		System.out.println("Sum: " + sum);
		// sum = 0 & j=1
		// sum = 1 & j=2
		// sum = 3 & j=3
		// sum = 6 & j=4
		// sum = 10 & j=5
		// sum = 15 & j=6 : j <=5 so false
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// 3. Print Even Numbers from 2 to 10:
		int k = 2;
		while (k <= 10) {
		    System.out.println(k);
		    k += 2;
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// 4. Reverse of number
		int number = 54321;
		int reversedNumber = 0;
		while (number != 0) {
		    int digit = number % 10;
		    reversedNumber = reversedNumber * 10 + digit;
		    number /= 10;
		    System.out.println(digit + " " + reversedNumber + " " + number);
		}
		System.out.println("Reversed Number: " + reversedNumber);
		
		// n=54321 and rev=0
		// d=1, rev=1, n=5432
		// d=2, rev=12, n=543
		// d=3, rev=123, n=54
		// d=4, rev=1234, n=5
		// d=5, rev=12345, n=0
		
	}

}
