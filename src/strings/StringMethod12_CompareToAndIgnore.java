package strings;

public class StringMethod12_CompareToAndIgnore {

	public static void main(String[] args) {
		
		// compareTo -> compares the given string with the current string lexicographically. 
		// It returns a positive number, negative number, or 0.
		
		// lexigraphic => "Abc...Zabc...z0123"
		
		//if s1 > s2, it returns positive number  
		//if s1 < s2, it returns negative number  
		//if s1 == s2, it returns 0  
		
		String str1 = "mango";
		String str2 = "mango";
		System.out.println("s1 == s2 : " + str1.compareTo(str2));
		
		String str3 = "banana";
		System.out.println("s1 > s2 : " + str1.compareTo(str3)); 
		// understanding => [m,b] => m > b => m is after b => positive
		
		String str4 = "apple";
		System.out.println("s1 < s2 : " + str4.compareTo(str3));
		// [a,b] => a < b => a is before b => negative
		
		// If two strings are same length and different strings
		System.out.println("s1.len()==s2.len() && s1!=s2 : " + str1.compareTo(str4));
		// ["mango","apple"] => [str1.charAt('m') - str4.charAt('a')] => [109-97] => [12] => positive
		
		// If two strings different length and differnt strings
		System.out.println("s1.len()!=s2.len() && s1!=s2 : " + str1.compareTo(str3));
		// ["mango","banana"] => [str1.charAt('m')-str3.charAt('b')] => [109-98] => [11] => positive
		
		// It checks seq of character where they can differ at k index.
		String str5 = "orange";
		String str6 ="oracle";
		System.out.println("s1 and s2 differ at 3rd index : " + str5.compareTo(str6));
		// [n, c] =>  n is after c => positive
		// [str5.charAt('n') - str6.charAt('c')] => [110-99] => 11
		
		String str7 = "ajay";
		String str8 = "aja";
		System.out.println(str7.compareTo(str8));
		// [str7.len() - str8.len()] => [4-3] = 1
		
		String str9 = "a";
		System.out.println(str8.compareTo(str9));
		// [str8.len() - str9.len()] => [3-1] = 2
		
		String str10 = "MAN";
		System.out.println(str1.compareTo(str10));
		//[m,M] => [109-77] = 32
		// [m,M] => m is after M = > positive
		
		// CompareToIngoreCase
		String str11 = "MAN";
		System.out.println(str1.compareToIgnoreCase(str11));
		// ["mango","MAN"] => [5-3] = 2
		
		String str12 = "MANGO";
		System.out.println(str1.compareToIgnoreCase(str12));
		
		String str13 = "Orange";
		System.out.println(str1.compareToIgnoreCase(str13));
		//[m,O] =>[m,o] => [109-111] => -2
		// Here m is before o = > negative

	}
}
