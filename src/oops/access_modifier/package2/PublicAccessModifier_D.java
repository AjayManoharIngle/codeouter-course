package oops.access_modifier.package2;

import oops.access_modifier.package1.PublicAccessModifer_A;

public class PublicAccessModifier_D extends PublicAccessModifer_A{
	
	void getNo() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// other package - other in subclass - yes 
		new PublicAccessModifier_D().getNo();
	}
}
