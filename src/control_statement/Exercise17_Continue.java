package control_statement;

import java.util.Scanner;

public class Exercise17_Continue {

	public static void main(String[] args) {
		// Give exam status false/true - failed/pass
        // if exam is pass 1st attempt = break - no need of next attempt
        // If exam is failed then give him 5 chances till he is pass exam
		
		Scanner sc = new Scanner(System.in);

        int chances = 1;
        boolean attempt = true;
        while(chances<=5) {
        		 System.out.println("Exam pass/failed in true/false - Attempt : " + chances + " = ");
        		 attempt = sc.nextBoolean();
        		 if(attempt==false){
        	        System.out.println("contine to attempt exam again- ");
        	        attempt = false;
        	        chances++;
        	        continue;
        	     }
        		 else{
        			 System.out.println("You have passed exam.");
        			 break;
        		 }
        }   
        if(attempt==false) {
			System.out.println("You failed in all attempt.");
		}
        sc.close();
	}

}
