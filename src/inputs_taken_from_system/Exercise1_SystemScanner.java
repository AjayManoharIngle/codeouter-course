package inputs_taken_from_system;

import java.util.Scanner;

public class Exercise1_SystemScanner {

	public static void main(String[] args) {
		
		// Do following operations - Sum, Sub, Mul, Division by system.in
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first No : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second No : ");
		int b = sc.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("Sum : " + sum);
		System.out.println("Sub : " + sub);
		System.out.println("Mul : " + mul);
		System.out.println("Div : " + div);
		
		sc.close();
	}
}
