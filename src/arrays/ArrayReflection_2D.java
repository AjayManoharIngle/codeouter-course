package arrays;

import java.lang.reflect.Array;

public class ArrayReflection_2D {

	public static void main(String[] args) {
		
		// Array Reflection with 2D
		
		int row = 2;
		int col = 2;
		
        int[][] dynamicArray2D = (int[][]) Array.newInstance(int.class, row, col);
        int[] row1 = (int[]) Array.get(dynamicArray2D,0);
        int[] row2 = (int[]) Array.get(dynamicArray2D,1);
        
        Array.setInt(row1, 0, 110);
		Array.setInt(row1, 1, 20);
		Array.setInt(row2, 0, 40);
		Array.setInt(row2, 1, 27);
		
		for(int[] i : dynamicArray2D) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
