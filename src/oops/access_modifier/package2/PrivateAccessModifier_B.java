package oops.access_modifier.package2;

import oops.access_modifier.package1.PrivateAccessModifier_A;

public class PrivateAccessModifier_B {

	public static void main(String[] args) {
		// other packages - other class - no
		PrivateAccessModifier_A privateAccessModifier_A = new PrivateAccessModifier_A();
		// System.out.println(privateAccessModifier_A.getNo());
		// System.out.println(privateAccessModifier_A.a);
	}

}
