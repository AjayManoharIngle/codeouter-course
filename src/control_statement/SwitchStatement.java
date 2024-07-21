package control_statement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		// Need of switch statement.
		// Print statement - we have 3 step : get success when it reached to 3rd position.
		
		int step = 3;
		if(step==1) {
			System.out.println("You reached step 1");	
		}else if(step == 2) {
			System.out.println("You reached step 2");
		}else if(step == 3) {
			System.out.println("Success - You reached step 3");
		}else {
			System.out.println("There is no valid step");
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		// write switch statement - not perform like if else
		switch(step) {
			case 1 : System.out.println("You reached step 1");
			case 2 : System.out.println("You reached step 2");
			case 3 : System.out.println("Success - You reached step 3");
			default : System.out.println("There is no valid step");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		// write switch statement
		switch(step) {
			case 1 : System.out.println("You reached step 1"); break;
			case 2 : System.out.println("You reached step 2"); break;
			case 3 : System.out.println("Success - You reached step 3"); break;
			default : System.out.println("There is no valid step");
		}		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		// Use “case” with character expression.
        // student -> ( a, b, c ) -> ( 74, 87,99 ) 
        // Ajay's division is b then what will be no of student in class.
        
        String name = "Ajay";
        char stud_division = 'C';
        int a = 74;
        int b = 87;
        int c = 99;
        switch (stud_division) {
            case 'A':
                System.out.println(name  + " is in A divison and has " + a + " students" );
                break;
            case 'B':
            	   System.out.println(name  + " is in B divison and has " + b + " students" );
                break;
            case 'C':
            	   System.out.println(name  + " is in C divison and has " + c + " students" );
                break;
            default:
                System.out.println("Student's divison does not exists");
        }
        
        System.out.println("++++++++++++++++++++++++++");
        
        // Use “case” with String expression.
        // student -> level( Beginner, Intermediate, Expert) -> Task(easy, meduim, hard )  
        
        String stud_level = "Expert";
        switch (stud_level) {
            case "Beginner":
                System.out.println("These students are beginner - easy");
                break;
            case "Intermediate":
                System.out.println("These students are intermediate.- meduim");
                break;
            case "Expert":
                System.out.println("These students are experts. - hard");
                break;
            default:
                System.out.println("Student does not exists");
        }
	}
}
