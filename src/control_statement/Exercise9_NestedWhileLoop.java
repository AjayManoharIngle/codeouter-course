package control_statement;

public class Exercise9_NestedWhileLoop {

	public static void main(String[] args) {
		
		// Print pattern
		// A
		// B C
		// D E F
		// G H I J
		
		int n = 4;
        char currentChar = 'A';
        int row = 1;

        while (row <= n) {
            int column = 1;
            while (column <= row) {
                System.out.print(currentChar + " ");
                currentChar++;
                column++;
            }
            System.out.println();
            row++;
        }
	}

}
