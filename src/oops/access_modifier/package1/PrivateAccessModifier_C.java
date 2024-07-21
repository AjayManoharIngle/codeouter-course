package oops.access_modifier.package1;

public class PrivateAccessModifier_C {

	public static void main(String[] args) {
		
		// within package - other class - no
		PrivateAccessModifier_A privateAccessModifier_A = new PrivateAccessModifier_A();
		//System.out.println(privateAccessModifier_A.a);
		// System.out.println(privateAccessModifier_A.getNo());
	}

}
