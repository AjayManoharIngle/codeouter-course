package arrays;

public class UserDefineArrayToMethods {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		stu[0] = new Student();
		stu[0].id = 101;
		stu[0].name = "Ajay";
		
		stu[1] = new Student();
		stu[1].id = 102;
		stu[1].name = "Vijay";
		
		stu[2] = new Student();
		stu[2].id = 103;
		stu[2].name = "Rohan";
		
		// pass array to method
		printStudentDetail(stu);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// return array to method
		Student[] s = returnArraytoMethod(stu);
		printStudentDetail(s);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// return anonymous array to method
		Student[] s1 = returnAnonymousArray(new Student[] {new Student(),new Student()},stu);
		printStudentDetail(s1);
	}

	private static Student[] returnAnonymousArray(Student[] students, Student[] stu) {
		students[0]=stu[0]; 
		students[1]=stu[1]; 
		return new Student[]{students[0],students[1]};
	}

	private static Student[] returnArraytoMethod(Student[] stu) {
		return stu;
	}

	private static void printStudentDetail(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			System.out.println("Student Id : " + stu[i].id + " and Student Name : " + stu[i].name) ;
		}
	}
}
