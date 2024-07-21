package strings;

public class WhyStringIsImmutable {

	public static void main(String[] args) {  
		
		// String objects are immutable. Immutable simply means unmodifiable or unchangeable.
		
		String name = "Ajay";
		name.concat("Ingle");
		System.out.println("Name : " + name);
		
		// name can not be modifyable.
		// Three reason : 
		
		// 1. Thread safe : Multiple threads wants to update string but they can not changed.
		// 2. Security : String contains sensitive info will not allowed modify.
		// 3. Heap Space : space will less used if no string is modify
	}
}
