package arrays;

public class Exercise3_TwoDim1 {

	public static void main(String[] args) {
		
		// Print : even numbers and odd numbers.
		// create array with 3 column and 2 rows => even = 2 4 6, odd = 1 3 5
		
		int ele[][] = {
				{1,2,3},
				{4,5,6}
		};
		
		int row = 2;
		int col = 3;
		
		String even = "";
		String odd = "";
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(ele[i][j] % 2 == 0) {
					even = even + ele[i][j] + " ";
				}
				else {
					odd = odd + ele[i][j] + " " ;
				}
			}
		}
		System.out.println("Even = : " + even + " , Odd = : " + odd);
	}
}
