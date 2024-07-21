package oops.access_modifier.package1;

public class PrivateAccessModifier_E extends PrivateAccessModifier_A{
	
	void getNo() {
		// System.out.println(a);
	}

	public static void main(String[] args) {
		
		// within sub class - within package - no 
		PrivateAccessModifier_E privateAccessModifier_E = new PrivateAccessModifier_E();
		privateAccessModifier_E.getNo();
	}
}
