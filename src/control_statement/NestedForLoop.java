package control_statement;

public class NestedForLoop {

	public static void main(String[] args) {
		
		// Print right star pattern
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		
		int n = 5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
					System.out.print("*"); 
			}
			System.out.println();
		}
		// ( row=1 1<=5 , col=1 1<=1) -> *
		// ( row=2 2<=5 , col=1 1<=2) -> * *
		// ( row=3 3<=5 , col=1 1<=3) -> * * *
		// ( row=4 4<=5 , col=1 1<=4) -> * * * * 
		// ( row=5 5<=5 , col=1 1<=5) -> * * * * *
	}
}
