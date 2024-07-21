package strings;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//It create mutable (modifiable) String objects. The StringBuilder class in Java is the same 
		//as String class except it is mutable i.e. it can be changed.
		// It is non-sync

		// mutable string
		StringBuilder name = new StringBuilder("Ajay");
		name.append(" Ingle");
		System.out.println(name);
		// HEAP = [name->Ajay, name -> Ajay Ingle]
		
		// capacity = how many char value is hold
		// default capacity = 16
		// new capacity = (old capacity + 1 ) * 2;
		// Find Capacity of default
		StringBuilder b=new StringBuilder(); 
		System.out.println("Capacity of string buffer default : " + b.capacity());
		b.append("abcdefghijklmnop");
		b.append("q");
		System.out.println("Capacity of string buffer updated : " + b.capacity());
		b.append("r");
		System.out.println("Capacity of string buffer updated : " + b.capacity());	
		
		// Find capacity with intial 
		StringBuilder c=new StringBuilder(5);
		System.out.println("Capacity of string buffer default : " + c.capacity());
		c.append("abcde");
		c.append("f"); // 5+1 = 6*2 = 12
		System.out.println("Capacity of string buffer updated : " + c.capacity());
		c.append("12312312312"); // only enter 11 char here because f is 1 char alredy inserted
		c.append("2"); // 12+1  = 13*2 = 26
		System.out.println("Capacity of string buffer updated : " + c.capacity());
		
		// find capacity with string
		StringBuilder f=new StringBuilder("Ajay"); // => new capacity = string.length() + 16 = 4+16 = 20
		System.out.println("Capacity of string buffer default : " + f.capacity());
		f.append("qweasdzxcqweasdz");   
		System.out.println("Capacity of string buffer updated : " + f.capacity());
		f.append("xcre");//=> ( 20 + 1 ) *2 = 42;
		System.out.println("Capacity of string buffer updated : " + f.capacity());
		f.append("g"); 
		System.out.println("Capacity of string buffer updated : " + f.capacity());	

	}
}
