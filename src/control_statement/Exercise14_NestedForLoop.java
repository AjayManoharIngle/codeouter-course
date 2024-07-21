package control_statement;

public class Exercise14_NestedForLoop {

	public static void main(String[] args) {
		
		// Print left star pattern.
		int n = 5;
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// ( row=1 1<=5, space=1 1<=4, col=1 1<=1) ->        *
		// ( row=2 2<=5, space=1 1<=3, col=1 1<=2) ->      * *
		// ( row=3 3<=5, space=1 1<=2, col=1 1<=3) ->    * * *
		// ( row=4 4<=5, space=1 1<=1, col=1 1<=4) ->  * * * *
		// ( row=5 5<=5, space=1 1<=0, col=1 1<=5) ->* * * * * 
	}
}
