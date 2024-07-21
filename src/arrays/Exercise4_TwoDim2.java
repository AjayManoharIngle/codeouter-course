package arrays;

public class Exercise4_TwoDim2 {

	public static void main(String[] args) {
		
		// Sum of all elemnets in 2d matrix -> row = 3 and column = 2
		
		int row = 3;
		int col = 2;
		int arr[][] = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		int sum = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum : "+sum);
		System.out.println("+++++++++++++++++++++++++++++");
		
		int total = 0;
		for(int[] i : arr) {
			for(int j :i ) {
				total += j;
			}
		}
		System.out.println("Sum : " + total);
	}
}
