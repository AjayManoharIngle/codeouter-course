package oops.access_modifier.package1;

public class DefaultAccessModifer_A {

	// instance var and public class
	int a = 10;
		
	public static void main(String[] args) {
		
		// Within same class - within package - yes
		// by default it is default - access within package and outside it is not allowed
		
		DefaultAccessModifer_A defaultAccessModifer_A = new DefaultAccessModifer_A();
		System.out.println(defaultAccessModifer_A.a);
		
	}

}
