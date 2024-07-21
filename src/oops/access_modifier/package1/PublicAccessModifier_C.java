package oops.access_modifier.package1;

public class PublicAccessModifier_C {

	public static void main(String[] args) {
		
		// within package - other class - yes
		
		PublicAccessModifer_A publicAccessModifer_A = new PublicAccessModifer_A();
		System.out.println(publicAccessModifer_A.a);
	}

}
