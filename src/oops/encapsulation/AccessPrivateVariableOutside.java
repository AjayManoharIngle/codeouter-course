package oops.encapsulation;

public class AccessPrivateVariableOutside {

	public static void main(String[] args) {
	
		Student1 studnet = new Student1();
		// System.out.println("Access private variable : " + studnet.studentAge); // not allowed to print
		
		// Data hiding :
		Studnet2 studnet2 = new Studnet2();
		System.out.println("Get private variable : " + studnet2.getStudentAge());
		studnet2.setStudentAge(22);
		System.out.println("Set private variable : " + studnet2.getStudentAge());

	}
}
