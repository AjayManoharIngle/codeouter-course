package control_statement;

import java.util.Scanner;

public class Exercise2_IfElse {

	public static void main(String[] args) {
		
		// 1. Student enter's math subject marks.
		// 2. if marks is more than 75% then studnet will get new shoes.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Math Marks : ");
		
		int stud_mark= sc.nextInt();
        if (stud_mark < 75) {
            System.out.println("Stduent will not get shoes.");
        }
        else {
            System.out.println("Stduent will get shoes.");
        }
        
        sc.close();
	}
}
