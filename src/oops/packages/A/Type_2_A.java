package oops.packages.A;

import oops.packages.B.Type_1_B;

public class Type_2_A {

	public static void main(String[] args) {
		
		// using packageName.className
		
		Type_1_B type_1_B = new Type_1_B();
		System.out.println(type_1_B.a);
	}
}
