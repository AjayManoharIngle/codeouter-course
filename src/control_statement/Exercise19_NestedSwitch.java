package control_statement;

public class Exercise19_NestedSwitch {

	public static void main(String[] args) {
		
		// student -> college year -> ( 1, 2 ) -> ( common subject, department ( cs, it, extc ) -> their subject
        
        String stud_department = "CS";
        int college_year = 2;
        switch (college_year) {
            case 1:
                System.out.println("Student year is 1 and have common subject.");
                break;
            case 2:
                switch (stud_department) {
                    case "CS":
                        System.out.println("Student year is 2 and OS, CN, COA are subjects.");
                        break;
                    case "EXTC":
                        System.out.println("Student year is 2 and Contol System, EDC, System signal are subjects.");
                        break;
                    default:
                        System.out.println("Students department not present");
                }
                break;
             default:
            	 System.out.println("There is only 2 year of students");
        }
	}
}
