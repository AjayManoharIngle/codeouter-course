package control_statement;

public class NestedWhileLoop {

	public static void main(String[] args) {
		
		// Print 1 pattern
		// 1
		// 1 1
		// 1 1 1
		// 1 1 1 1
				
		int no = 4;
		int row=1,col=1;
		while(row<=no)
		{
			while(col<=row)
            {
            	System.out.print(1);
                col++;        
            }
            row++;
            System.out.println("");
            col=1;         
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		// row=1, col=1,1<=1=> 1
		// row=2, col=1,1<=2=> 1 1
		// row=3, col=1,1<=3=> 1 1 1
		// row=4, col=1,1<=4=> 1 1 1 1
		
		// Print pattern
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		
		int row1=1,col1=1;
		while(row1<=no)
		{
			while(col1<=row1)
            {
            	System.out.print(col1);
                col1++;        
            }
            row1++;
            System.out.println("");
            col1=1;         
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		// Print 1 pattern
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		
		int row2=1,col2=1;
		while(row2<=no)
		{
			while(col2<=row2)
            {
            	System.out.print(row2);
                col2++;        
            }
            row2++;
            System.out.println("");
            col2=1;         
		}
	}

}
