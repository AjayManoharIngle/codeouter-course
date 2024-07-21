package oops.access_modifier.package2;

import oops.access_modifier.package1.PublicAccessModifer_A;

public class PublicAccessModifer_B {

	public static void main(String[] args) {
		
		// other packages - other class - yes
		PublicAccessModifer_A publicAccessModifer_A = new PublicAccessModifer_A();
		System.out.println(publicAccessModifer_A.a);
	}
}
