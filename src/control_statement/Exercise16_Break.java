package control_statement;

import java.util.Scanner;

public class Exercise16_Break {

	public static void main(String[] args) {
		
		 // Give exam status false/true - failed/pass
        // if exam is pass 1st attempt = break no need of next attempt
        // If exam is failed then give him 5 chances till he is pass exam
		
		Scanner sc = new Scanner(System.in);

        int chances = 1;
        boolean attempt = false;
        while(chances<=5 && attempt==false) {
        		 System.out.println("Exam pass/failed in true/false - Attempt : " + chances + " = ");
        		 attempt = sc.nextBoolean();
        		 if(attempt){
        	        System.out.println("You have passed exam.");
        	        attempt = true;
        	        break;
        	     }
        		 chances++;
        }   
        if(attempt==false) {
			System.out.println("You failed in all attempt.");
		}
        
        sc.close();
	}

}
