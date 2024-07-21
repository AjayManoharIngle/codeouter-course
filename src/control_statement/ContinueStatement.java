package control_statement;

public class ContinueStatement {

	public static void main(String[] args) {
		

		//The continue statement in Java is used to skip the rest of the code inside a loop for 
        //the current iteration and proceed to the next iteration.
		
		// Flow of continue statement
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
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
        		start++;
        		continue;
        	}
        	System.out.print(start + " ");
        	start++;
        }while(start <= end);
	}

}
