package oops.access_modifier.package2;

import oops.access_modifier.package1.DefaultAccessModifer_A;

public class DefaultAccessModifier_B {
	
	void getNo() {
		// System.out.println(new DefaultAccessModifer_A().a);
	}

	public static void main(String[] args) {
		
		// other packages - other class - no
		
		new DefaultAccessModifier_B().getNo();
	}

}
