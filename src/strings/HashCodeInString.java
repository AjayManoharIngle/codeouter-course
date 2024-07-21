package strings;

public class HashCodeInString {

	public static void main(String[] args) {
		
		// hashcode() -> Returns a hash code value for the string
		// hashcode with SCP and HEAP
		
		// NOTE : If two strings are equal then hashcode is same , doesn't matter SCP and HEAP concept.
		String str9 = "Java";
		String str10 = "Java";
		boolean equal = str9.hashCode()==str10.hashCode();
		System.out.println("is hashcode equal : " + equal);
		
		String str11 = new String("Java");
		String str12 = new String("Java");
		boolean equal1 = str11.hashCode()==str12.hashCode();
		System.out.println("is hashcode equal : " + equal1);
		
		// NOTE : If two hashcode is equal it doesn't mean strings are equal.
		String str1 = "Aa";
		String str2 = "BB";
		System.out.println("Both hashcode is equal : " + (str1.hashCode()==str2.hashCode()));
		System.out.println("Both string is equal : " + str1.equals(str2));

	}
}
