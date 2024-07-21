package strings;

public class Conversions {

	public static void main(String[] args) {
		
		// 1. String to String Buffer
		String a = new String("Ajay");
		StringBuffer sa = new StringBuffer(a);
		sa.append("Ingle");
		System.out.println(sa);
		
		// 2. String to String Builder
		String b = new String("Ajay");
		StringBuilder sb = new StringBuilder(b);
		sb.append("Ingle");
		System.out.println(sb);
		
		// 3. String Buffer to String
		StringBuffer c = new StringBuffer("Ajay");
		String sc = c.toString();
		sc.concat("Ingle");
		System.out.println(sc);
		
		// 4. String Builder to String 
		StringBuilder d = new StringBuilder("Ajay");
		String sd = d.toString();
		sd.concat("Ingle");
		System.out.println(sd);
		
		// 5. String Buffer to String Builder
		StringBuffer e = new StringBuffer("Ajay");
		StringBuilder se = new StringBuilder(e);
		se.append("Ingle");
		System.out.println(se);
		
		// 6. String Builder to String Buffer
		StringBuilder f = new StringBuilder("Ajay");
		StringBuffer sf = new StringBuffer(f);
		sf.append("Ingle");
		System.out.println(sf);
		
	}
}
