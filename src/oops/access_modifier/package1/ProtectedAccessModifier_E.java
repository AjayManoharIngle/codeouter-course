package oops.access_modifier.package1;

public class ProtectedAccessModifier_E extends ProtectedAccessModifier_A{
	
	void getNo() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// within sub class - within package - yes
		new ProtectedAccessModifier_E().getNo();
	}
}
