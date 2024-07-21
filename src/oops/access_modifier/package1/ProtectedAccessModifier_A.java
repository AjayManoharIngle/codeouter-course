package oops.access_modifier.package1;

public class ProtectedAccessModifier_A {
	
	// instance var
	protected int a = 10;

	public static void main(String[] args) {
		
		// Within same class - within package - yes
		ProtectedAccessModifier_A protectedAccessModifier_A = new ProtectedAccessModifier_A();
		System.out.println(protectedAccessModifier_A.a);
	}

}
