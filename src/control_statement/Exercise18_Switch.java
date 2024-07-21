package control_statement;

public class Exercise18_Switch {

	public static void main(String[] args) {
		
		// student competition - ( 18, 20, 22 ) -> games -> ( easy, meduim, high)
		
		int stud_age = 20;
        switch (stud_age) {
            case 18:
	            System.out.println("This age students has easy games");
	            break;
            case 20:
            	System.out.println("This age students has meduim games");
                break;
            case 22:
            	System.out.println("This age students has high games");
                break;
            default:
                System.out.println("Student does not exists");
        }
		
				
	}
}
