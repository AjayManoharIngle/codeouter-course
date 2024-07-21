package oops.access_modifier.package1;

public class PrivateAccessModifier_A {
	
	// instance var and public class
	private int a = 10;
	
	private int getNo() {
		return a;
	}

	public static void main(String[] args) {
		
		// private int b = 20; // local var can not be private
		
		// Within same class - within package - yes
		PrivateAccessModifier_A privateAccessModifier_A = new PrivateAccessModifier_A();
		System.out.println(privateAccessModifier_A.a);
		System.out.println(privateAccessModifier_A.getNo());
		
	}

}
