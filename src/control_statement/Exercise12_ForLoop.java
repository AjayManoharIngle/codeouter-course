package control_statement;

public class Exercise12_ForLoop {

	public static void main(String[] args) {
		
		// Factorial of number.
		// 5! = 5*4*3*2*1 = 120
		
		int i,fact=1;  
		int number=5;    
		for(i=1;i<=number;i++){    
		      fact=fact*i;    
		}
		
		System.out.println("Factorial of " + number + " is " + fact);
		
		// i = 1 , fact = 1
		// i = 2 , fact = 2
		// i = 3 , fact = 6
		// i = 4 , fact = 24
		// i = 5 , fact = 120
		
	}
}
