package oops.constructor;

public class ThisKeyword {

	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		System.out.println("Class Object : " + tk);
		
		tk.prove();
	}

	private void prove() {
		System.out.println("This keyword : " + this);
	}
}


