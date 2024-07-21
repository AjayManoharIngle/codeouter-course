package oops.interfaces;

interface P {

	default String printName(String secretName) {
		return genearteSecretName("100001",secretName);
	}
	
	// private method can static or non static
	private String genearteSecretName(String dob,String secretName) {
		return dob+"-"+secretName;
	}
}

class Q implements P {} // not required override methid

class R implements P {

	@Override
	public String printName(String secretName) {
		return P.super.printName(secretName);
	}

}

public class Java9_PrivateMethods {

	public static void main(String[] args) {
		
		// it is used when we need to provide all secure methods to interface with body and if that methods 
		// wants to execute by child class they will get it by default method override
		
		P p = new R();
		String code = p.printName("Ajay Ingle");
		System.out.println("Your code : " + code);
	}
}
