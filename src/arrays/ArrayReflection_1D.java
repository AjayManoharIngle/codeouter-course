package arrays;

import java.lang.reflect.Array;

public class ArrayReflection_1D {

	public static void main(String[] args) {
		
		// The Java Reflection class provides static methods, and
		// these methods can be used to create and access Java arrays in a dynamic manner.
		// it is ensures your type of data - type-safe at runtime
		
		// Array Reflection with 1D
		int size = 5;
		int[] reflect = (int[]) Array.newInstance(int.class,size); // (component type, length)
		Array.setInt(reflect, 0, 110);
		Array.setInt(reflect, 1, 20);
		Array.setInt(reflect, 2, 40);
		Array.setInt(reflect, 3, 27);
		Array.setInt(reflect, 4, 50);
		
		for(int i : reflect) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		for(int i=0;i<reflect.length;i++) {
			System.out.print(reflect[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println(reflect.getClass().getComponentType());
		System.out.println(Array.getLength(reflect));
		
		// Diff of Normal Array from Array Reflection.
		// -> We have methods to set and get array ele unlike basic array will get everything though indexing.
		// -> We can get type of array at dynmic time unlike basic array not give type information.
		
	}
}
