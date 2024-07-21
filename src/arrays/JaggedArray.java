package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		// each row in a two dimensional array is itself an array, therefore, rows can have different lengths or sizes. 
		// A two-dimensional array with different rows is called jagged array in java.
		
		// 2D - Array
		
		int a[][] = {
				{1,2,3},
				{1,2},
				{1}
		};
		
		// using for loop
		int row = 3;
		int col = 3;
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println(" ");
//		}
		
		// --> we are getting problem while traversing elemnt in array cause each subarray of 2D has differnt length.
		
		// Test with using for each.
		
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		// But if we want to do with for loop - use jagged concept.
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) { // get each subarry length like [3,2,1]
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
