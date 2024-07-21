package oops.access_modifier.package2;

import oops.access_modifier.package1.DefaultAccessModifer_A;

public class DefaultAccessModifier_D extends DefaultAccessModifer_A{
	
	void getNo() {
		// System.out.println(a);
	}

	public static void main(String[] args) {
		
		// other package - other in subclass - no
		DefaultAccessModifier_D defaultAccessModifer_D = new DefaultAccessModifier_D();
		defaultAccessModifer_D.getNo();
	}
}
