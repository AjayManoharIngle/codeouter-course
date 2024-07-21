package strings;

public class StringMethod15_Intern {

	public static void main(String[] args) {
		
		//intern -> It can be used to return string from memory if it is created by a new keyword. 
			//	It creates an exact copy of the heap string object in the String Constant Pool.
	
		String name = new String("Ajay");
		// Heap = [name -> Ajay]
		
		name = name.intern(); // creates object in SCP also
		
		String name1 = "Ajay";
		
		System.out.println("JVM treat AJAY as one in SCP : " + (name == name1));
		// SCP => [name,name1 -> "Ajay"]
		
		// -------------------------------------------------------------
		
		// Example :
		String s1 = new String("man");
		String s2 = new String("man");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		// if i want to make this equal using == ..i need to use intern cause will put both string in SCP
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
}
