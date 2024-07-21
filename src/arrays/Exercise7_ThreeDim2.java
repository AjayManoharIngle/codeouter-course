package arrays;

public class Exercise7_ThreeDim2 {

	public static void main(String[] args) {
		
		String[ ] department = {"Electronics", "CS", "IT"};
		String[] studNames = {"Deep","Amit","Larry"};
		
		// Print avag marks of students in department
		
		int[][][] scoresBoard = {
			//	Ele , CS, IT
		       {{75, 87, 69}, {90, 87, 85},{56, 67, 76}}, 
		       {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}}, 
		       {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}
		};
				
		// Deep - score in electronic => {75, 87, 69}
		// Amit - score in electronic => {78, 67, 75}
		// Larry - score in electronic => {72, 63, 72}
		
		double avg = 0;
		for(int dept=0;dept<scoresBoard.length;dept++) {
			int total = 0;
			for(int student=0;student<scoresBoard.length;student++) {
				for(int score=0;score<scoresBoard.length;score++) {
					total += scoresBoard[dept][student][score];
				}
				avg = total/scoresBoard.length;
			}
			System.out.println("Avg marks of student " + studNames[dept] + " is : " + avg);
		}		
	}
}
