package datatypes;

public class DataTypeConversions {

	public static void main(String[] args) {
		
		// Important conversion = 11
		
		// String Conversion : 
		// String to int
		String a = "200";
		String b = "100";
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		System.out.println("String to Integer : " + (i+j));
		
		// String to long
		String s="9990449935";  
		long l=Long.parseLong(s);  
		System.out.println("String to Long : " + l); 
		
		// String to float
		String k="23.6";  
		float f=Float.parseFloat(k);  
		System.out.println("String To Float : " + f); 
		
		// String to double
		String g="23.6";  
		double d=Double.parseDouble(g);  
		System.out.println("String to double : " + d); 
		
		// String to boolean
		String s1="true";  
		String s2="TRue";  
		boolean w11=Boolean.parseBoolean(s1);  
		boolean w12=Boolean.parseBoolean(s2);
		System.out.println(w11 + " " + w12);

		// Int Conversion : 
		// int to String
		int u=10;  
		String w1=String.valueOf(u);  
		String w2=Integer.toString(u);
		System.out.println(w1 + " " + w2);
		
		// int to long
		int q=200;  
		long l1=q;               // with direct method
		Long l2=Long.valueOf(q); // with Long.valueof
		System.out.println(l1 + " " + l2);
		
		// int to double
		int e=200;  
		double jj=e;  // direct method 
		Double w3=Double.valueOf(e); //  Double.vauleOf 
		System.out.println(jj + " " + w3);
		
		// int to char
		int I=65;  
		char c=(char)I;  
		System.out.println(c);
		
		// Boolean
		// boolean to string
		boolean b1=true;  
		boolean b2=false;  
		String wq=String.valueOf(b1);   // String.valueOf()
		String wp=String.valueOf(b2);  
		String w21=Boolean.toString(b1);  // Boolean.toString()
		String w22=Boolean.toString(b2);
		System.out.println(wq + " " + wp + " " + w21 + "  "+ w22);
	}
}
