package oops.packages.A;

import oops.packages.B.*;

public class Type_1_A {

	public static void main(String[] args) {
		
		// using package.*
		
		Type_1_B type_1_B = new Type_1_B();
		Type_2_B type_2_B = new Type_2_B();
		
		System.out.println(type_1_B.a);
		System.out.println(type_2_B.b);
	}
}
