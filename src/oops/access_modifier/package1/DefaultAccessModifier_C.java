package oops.access_modifier.package1;

public class DefaultAccessModifier_C {

	public static void main(String[] args) {
		// within package - other class - yes
		
		DefaultAccessModifer_A defaultAccessModifer_A = new DefaultAccessModifer_A();
		System.out.println(defaultAccessModifer_A.a);
	}

}
