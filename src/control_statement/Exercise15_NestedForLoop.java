package control_statement;

public class Exercise15_NestedForLoop {

	public static void main(String[] args) {
		// Print pyramid pattern
		
		int n = 5;
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
