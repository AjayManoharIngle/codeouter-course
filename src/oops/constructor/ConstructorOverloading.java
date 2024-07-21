package oops.constructor;

class School{
	
	String schoolName;
	int schoolYear;
	char schoolGrade;
	
	// Non Param constructor
	School(){
		schoolName = "CHS";
		schoolYear = 2002;
	}
	
	// Param Constructor
	School(String sName, int sRollNo){
		schoolName = sName;
		schoolYear = sRollNo;
	}
	
	School(String sName, int sRollNo,char sgrade){
		schoolName = sName;
		schoolYear = sRollNo;
		schoolGrade = sgrade;
	}
	
	void printSchoolData() {
		System.out.println("School Name : " + schoolName);
		System.out.println("School Year :  " + schoolYear);
		System.out.println("School Grade : " + schoolGrade);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		// Constructor overload - same class name with different parameter
		
		School school = new School();
		school.printSchoolData();
		System.out.println("++++++++++++++++++++");
		
		School school1 = new School("CWMS",2001);
		school1.printSchoolData();
		System.out.println("++++++++++++++++++++");
		
		School school2 = new School("CDS",1999,'A');
		school2.printSchoolData();
	}
}
