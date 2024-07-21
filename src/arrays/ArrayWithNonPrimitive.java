package arrays;

public class ArrayWithNonPrimitive {

	public static void main(String[] args) {
		
		// Non primitive - objects can be reflected if it original content is modified.
		
		int a[] = {1,2,3,4};
		int b[] = a;
			
		System.out.println("Before : ");
		for(int i : a)
			System.out.print(i + " ");
		System.out.println(" ");
		
		for(int i : b)
			System.out.print(i + " ");
		System.out.println(" ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		// change value of b
		b[2] = 20;
		
		// value of a also changed and b also
		System.out.println("After : ");
		for(int i : a)
			System.out.print(i + " ");
		System.out.println(" ");
		
		for(int i : b)
			System.out.print(i + " ");
		System.out.println(" ");
	}
}
