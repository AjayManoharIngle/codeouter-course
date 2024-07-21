package arrays;

import java.util.Scanner;

public class Exercise9_UserDefineArray {

	public static void main(String[] args) {
		
		// Take student data from student and store it in array and print
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student data : ");
		System.out.println("How many student data you want to entered : ");
		int no = sc.nextInt();
		
		Student[] student = new Student[no];
		
		for(int i=0;i<no;i++) {
			System.out.println("Enter Student Id : "); 
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Student Name : ");
			String name = sc.nextLine();
			
			student[i] = new Student();
			student[i].id = id;
			student[i].name = name;
		}
		
		for(Student stu : student) {
			System.out.println("Student Id : " + stu.id + " & Student Name : " + stu.name);
		}
		
		sc.close();
	}
}
