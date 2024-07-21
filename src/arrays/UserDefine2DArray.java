package arrays;

public class UserDefine2DArray {

	public static void main(String[] args) {
		
		int noOfStudent = 2;
		int AvgMarks = 3;
					
		Student[][] student = new Student[noOfStudent][AvgMarks];
		
		//       CS IT EC
		// s0 => 80 89 99
		// s1 => 45 78 89
		
		student[0][0] = new Student();
		student[0][0].marks = 80;
				
		student[0][1] = new Student();
		student[0][1].marks = 89;
		
		student[0][2] = new Student();
		student[0][2].marks = 99;
		
		student[1][0] = new Student();
		student[1][0].marks = 45;
		
		student[1][1] = new Student();
		student[1][1].marks = 78;
		
		student[1][2] = new Student();
		student[1][2].marks = 89;
		
		for(int i=0;i<student.length;i++) {
			double total = 0;
			for(int j=0;j<student[i].length;j++) {
				total = total + (student[i][j].marks);
			}
			double avg = total / student.length;
			System.out.println("Student " + i + " has avg marks : " + avg );
		}
	}

}
