package arrays;

public class Exercise5_TwoDim3 {

	public static void main(String[] args) {
		
		// Print total marks gained by all students individually
		
		String[] studNames = {"Deep","Amit","Larry"};
		
		int marks[][] = {
				{80,97,80},
				{99,98,100},
				{87,99,93}
		};
		
		for(int i=0;i<marks.length;i++) {
			int total = 0;
			for(int j=0;j<marks.length;j++) {
				total += marks[i][j];
			}
			System.out.println("Total marks gained by student " + studNames[i] + " is  : " + total);
		}
	}
}
