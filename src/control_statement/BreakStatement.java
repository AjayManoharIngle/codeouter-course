package control_statement;

public class BreakStatement {

	public static void main(String[] args) {
		
		//The break statement in Java is used to exit a loop prematurely, 
		//stopping its execution even if the loop condition is not met.
		
		// Flow of break statement
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking out of the loop when i = " + i);
                break;
            }
            else {
                System.out.println("Inside the loop with i = " + i);
            }
        }

        System.out.println("Outside the loop");
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        // Stop execution when you find number no in given range
        int start=1;
        int end = 7;
        int find = 5;
        do {
        	if(start==find) {
        		break;
        	}
        	System.out.print(start + " ");
        	start++;
        }while(start <= end);
   }	
}
