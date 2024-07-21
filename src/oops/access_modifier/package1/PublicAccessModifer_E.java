package oops.access_modifier.package1;

public class PublicAccessModifer_E extends PublicAccessModifer_A {
	
	void getNo() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// within sub class - within package - yes
		new PublicAccessModifer_E().getNo();
		
		
		// Access local variable - not possible in any situation
		// System.out.println(new PublicAccessModifer_A().b);
		
	}
}
