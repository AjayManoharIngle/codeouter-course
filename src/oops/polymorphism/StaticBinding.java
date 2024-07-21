package oops.polymorphism;

public class StaticBinding {
	
	// static binding - compile time check ref - early binding - method overlaoding

	public static void main(String[] args) {
		
		StaticBinding sb = new StaticBinding();
		sb.msg();
		sb.msg(10);
	}
	
	private void msg() {
		System.out.println("private msg...");
	}
	
	public static void msg(int a) {
		System.out.println("Number : " + a);
	}
}
