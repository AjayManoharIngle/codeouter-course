package oops.access_modifier.package2;

import oops.access_modifier.package1.PrivateAccessModifier_A;

public class PrivateAccessModifier_D extends PrivateAccessModifier_A{
	
	void getNo() {
		// System.out.println(a);
	}

	public static void main(String[] args) {
		
		// other package - other in subclass - no
		new PrivateAccessModifier_D().getNo();
	}
}
