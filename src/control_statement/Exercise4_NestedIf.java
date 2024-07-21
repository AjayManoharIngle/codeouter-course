package control_statement;

import java.util.Scanner;

public class Exercise4_NestedIf {

	public static void main(String[] args) {
		
		// Take Student college name and his ID number
		// If All details match then only student allow to write exam in allotted college.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student College Name : ");
		String stud_college = sc.nextLine();
		System.out.println("Enter student Id : ");
        int stud_no = sc.nextInt();
        
        if(stud_college.equals("VIT")) {
        	if(stud_no == 12345) {
        		System.out.println("Student is allowd to write exam ");
        	}
        }
        sc.close();
	}
}
