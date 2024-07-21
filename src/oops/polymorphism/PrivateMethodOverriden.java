package oops.polymorphism;

class X {
	private void msg() {
		System.out.println("Messge from X");
	}
}

class Y extends X{

}

public class PrivateMethodOverriden {

	public static void main(String[] args) {
		
		// can we override private method - No
		
		Y y = new Y();
		//y.msg(); // private method not visiable
	}

}
