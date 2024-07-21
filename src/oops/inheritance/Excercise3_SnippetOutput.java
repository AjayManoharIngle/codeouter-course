package oops.inheritance;

class A{
	String name = "A";
	static String names = "AS";
}

class B extends A {  
	String name = "B";
	static String names = "BS";
}

class C extends B {  
	String name = "C";
	String cname = "CName";
	static String names = "CS";
}

public class Excercise3_SnippetOutput {

	public static void main(String[] args) {
		
		A f1 = new B(); 
		B f2 = new B();
		System.out.println("F1 : " + f1.name);
		System.out.println("F2 : " + f2.name);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		// check with static : 
		System.out.println("F1 : " + f1.names);
		System.out.println("F2 : " + f2.names);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		// Print C : 
		A f3 = new C();
		System.out.println(f3.name + "  "  + f3.names );
	}

}
