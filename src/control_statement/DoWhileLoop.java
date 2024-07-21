package control_statement;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//The do-while loop checks the condition after executing the loop body.
		//This guarantees that the loop body is executed at least once.
		
		// 1. Print Numbers from 1 to 5:
		int i = 1;
		do{
		    System.out.println(i);
		    i++;
		}while (i <= 5);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		// 2. Calculate the Sum of Numbers from 1 to 5:
		int sum = 0;
		int j = 1;
		do{
		    sum += j;
		    j++;
		}while (j <= 5);
		System.out.println("Sum: " + sum);	
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		// 3. Print Even Numbers from 2 to 10:
		int k = 2;
		do{
		    System.out.println(k);
		    k += 2;
		}while (k <= 10);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
				
	}
}
