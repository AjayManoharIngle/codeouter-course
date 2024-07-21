package strings;

public class StringMethod11_IndexOfAndLast {

	public static void main(String[] args) {
		
		// indexOf -> returns the position of the first occurrence of the specified character 
		// or string in a specified string
		
		String name = "Ajay Manohara Ingleay";
		int index1 = name.indexOf('o');
		System.out.println("charcter index : " + index1);
		
		int index2 = name.indexOf("Ingle");
		System.out.println("String index : " + index2);
		
		int index3 = name.indexOf("a",4);
		System.out.println("From index 4 search where is first a char is present : " + index3);
		
		int index4 = name.indexOf("ay",5);
		System.out.println("From index 5 search where is first ay string is present : " + index4);
		
		// LastIndexOf -> returns the last index of the given character value or substring.
		// If it is not found, it returns -1.
		
		int lastIndex1 = name.lastIndexOf('a');
		System.out.println("Last charater index : " + lastIndex1);
		
		int lastIndex2 = name.lastIndexOf("ay");
		System.out.println("Last string index : " + lastIndex2);
		
		// 10 is index where last index of where you want to search till.
		int lastIndex3 = name.lastIndexOf("r", 10);
		System.out.println("get index of char r which is at last presnt : " + lastIndex3);
		
		int lastIndex4 = name.lastIndexOf("ra", 10);
		System.out.println("get index of string ra which is at last presnt : " + lastIndex4);
	}
}
