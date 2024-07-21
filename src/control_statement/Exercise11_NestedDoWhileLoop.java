package control_statement;

public class Exercise11_NestedDoWhileLoop {

	public static void main(String[] args) {
		
		// Print - Number table in right pattern
//		2 
//		4 6 
//		8 10 12 
//		14 16 18 20  
		
		int rows = 4;

        int i = 1;
    
        int table = 7;
        int currentValue = table;
        
        do {
            int j = 1;
            do {
                System.out.print(currentValue + " ");
                currentValue += table;
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= rows);
	}
}
