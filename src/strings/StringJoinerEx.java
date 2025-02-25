package strings;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {

		// StringJoiner is a class in java.util package is used to construct a sequence
		// of characters(strings) separated by a delimiter and
		// optionally starting with a supplied prefix and ending with a given suffix.

		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);

		StringJoiner joinNames1 = new StringJoiner("-", "[", "]"); // passing comma(-) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames1.add("Rahul");
		joinNames1.add("Raju");
		System.out.println("String Joiner 1 : " + joinNames1);

		// Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "{", "}"); // passing colon(:) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");
		System.out.println("String Joiner 2 : " + joinNames2);

		// Merging two StringJoiner
		joinNames1.merge(joinNames2);
		System.out.println(joinNames1);
		
		joinNames2.merge(joinNames1);
		System.out.println(joinNames2);
	}
}
