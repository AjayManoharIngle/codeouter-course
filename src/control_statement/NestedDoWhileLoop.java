package control_statement;

public class NestedDoWhileLoop {

	public static void main(String[] args) {
		// Print 1 pattern
		// 1
		// 1 1
		// 1 1 1
		// 1 1 1 1
				
		int no = 4;
		int row=1,col=1;
		
		do{
            do{
            	System.out.print(1);
                col++;        
            }while(col<=row);
            row++;
            System.out.println("");
            col=1;         
		}while(row<=no);		
	}
}
