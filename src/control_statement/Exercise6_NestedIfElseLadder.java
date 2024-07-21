package control_statement;

import java.util.Scanner;

public class Exercise6_NestedIfElseLadder {

	public static void main(String[] args) {
		
		// We have total students from roll no - 101 to 130.
        // roll no from  101 to 110 will be in music team but condtion is - marks between [50,70]
        // roll no from 111, 120 will  be in sports team but condtion is - marks between [71,80]
        // roll no from 121, 130 will be in dance team but condtion is - marks between [81,100]
		// other's are in drama team
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please your id from [101-130] : ");
		int id = sc.nextInt();
		System.out.println("Enter marks of student : ");
		int mark = sc.nextInt();
        boolean A = id>=101 && id<=110;
        boolean B = id>=111 && id<=120;
        boolean C = id>=121 && id<=130;
        
        if (id < 101) {
            System.out.println("This student is does not exists.");
        } 
        else if(A || B || C) {
        	if(A && (mark>=50 && mark<=70)) {
        		System.out.println("You are in music team.");
        	}else if(B && (mark>=71 && mark<=80)) {
        		System.out.println("You are in sports team");
        	}else if(C && (mark>=81 && mark<=100)) {
        		System.out.println("You are in dance team");
        	}
        	else {
        		System.out.println("Id or marks not valid so you are in drama team.");
        	}
        }
        else {
        	System.out.println("You are in drama team");
        }
        
        sc.close();
	}
}
