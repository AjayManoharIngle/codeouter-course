package datatypes;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//Wrapper classes are a set of classes that 
		//provide a way to represent primitive data types as objects.
		
		// 1. Used when need to implement API anything is related to objects.
		// 2. Have additional methods to perform. ex.equals()
		// 3. Store in heap
		// 4. All wrapper classes are under java.lang package
		
		// Types : Auto-boxing and Un-boxing
		
		// Auto-boxing : Convert Primitive to Objects
		byte b=10;  
		short s=20;  
		int i=20;  
		long l=40;  
		float f=30.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;
		
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
				
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj);  
		
		// Un-boxing : Convert Objects to Primitive
		
		byte bytevalue=byteobj;  
		short shortvalue=shortobj;  
		int intvalue=intobj;  
		long longvalue=longobj;  
		float floatvalue=floatobj;  
		double doublevalue=doubleobj;  
		char charvalue=charobj;  
		boolean boolvalue=boolobj;  
		
		
		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue); 
		
		// Equals method
		// if we want to equals of two object
		shortobj=(short) i;  
		intobj=i; 
		Integer ii = i;
		
		//The equals method in Java is used to compare the 
		//content or values of objects, not their references.
		System.out.println(intobj.equals(shortobj));
		System.out.println(intobj.equals(ii));
	}
}
