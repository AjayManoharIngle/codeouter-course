package oops.access_modifier.package1;

public class DefaultAccessModifier_E extends DefaultAccessModifer_A{
	
	void getNo() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		// within sub class - within package - yes
		new DefaultAccessModifier_E().getNo();
	}

}
