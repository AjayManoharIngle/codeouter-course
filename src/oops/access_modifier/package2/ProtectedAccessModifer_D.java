package oops.access_modifier.package2;

import oops.access_modifier.package1.ProtectedAccessModifier_A;

class ProtectedAccessModifer_D extends ProtectedAccessModifier_A {
	
	void getNo() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// other package - other in subclass - no
		new ProtectedAccessModifer_D().getNo();
	}
}
