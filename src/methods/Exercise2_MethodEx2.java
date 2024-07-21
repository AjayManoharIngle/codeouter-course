package methods;

public class Exercise2_MethodEx2 {

	public static void main(String[] args) {
		
		// To give type of method and print result
		String type = "sub";
		int a = 10;
		int b = 20;
		cal(type,a,b);
	}

	static void cal(String type, int a, int b) {
		switch(type) {
			case "add": System.out.println("Addition : " + (a+b)); break;
			case "sub": System.out.println("Substraction : " + (a-b)); break;
			case "mul": System.out.println("Multiplication : " + (a*b)); break;
			case "div": System.out.println("Division : " + (a/b)); break;
			default : System.out.println("Invalid type eneterd.");
		}
	}
}
