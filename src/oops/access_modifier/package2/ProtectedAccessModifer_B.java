package oops.access_modifier.package2;

import oops.access_modifier.package1.ProtectedAccessModifier_A;

public class ProtectedAccessModifer_B {
	
	void getNo() {
		// System.out.println(new ProtectedAccessModifier_A().a);
	}

	public static void main(String[] args) {
		
		// other packages - other class - No => not allowed
		new ProtectedAccessModifer_B().getNo();
	}
}
