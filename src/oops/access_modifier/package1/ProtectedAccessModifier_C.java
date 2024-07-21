package oops.access_modifier.package1;

public class ProtectedAccessModifier_C {
	
	void getNo() {
		System.out.println(new ProtectedAccessModifier_A().a);
	}

	public static void main(String[] args) {
		
		// within package - other class - yes
		new ProtectedAccessModifier_C().getNo();
	}
}
