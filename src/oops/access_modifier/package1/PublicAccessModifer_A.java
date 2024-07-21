package oops.access_modifier.package1;

public class PublicAccessModifer_A {
	
	// instance var and public class
	public int a = 10;

	public static void main(String[] args) {
		
		int b = 20;
		
		// Within same class - within package - yes
		PublicAccessModifer_A publicAccessModifer_A = new PublicAccessModifer_A();
		System.out.println(publicAccessModifer_A.a);
	}
}
