package control_statement;

import java.util.Scanner;

public class Exercise3_IfElseLadder {

	public static void main(String[] args) {
		
		// We have total students from roll no - 101 to 130.
        // roll no from  101 to 110 will be in music team
        // roll no from 111, 120 will  be in sports team
        // roll no from 121, 130 will be in dance team
		// others are in drama team
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please your id from [101-130] : ");
		int stud_id = sc.nextInt();
		
        if (stud_id < 101) {
            System.out.println("This student is does not exists.");
        } else if (stud_id >= 101 && stud_id <= 110) {
            System.out.println("This student is in music team.");
        } else if (stud_id >= 111 && stud_id <= 120) {
            System.out.println("This student is in sports team ");
        } else if (stud_id >= 121 && stud_id <= 130) {
            System.out.println("This student is in dancing team ");
        } else {
            System.out.println("This id of studnet is in drama team.");
        }
        
        sc.close();
	}
}
