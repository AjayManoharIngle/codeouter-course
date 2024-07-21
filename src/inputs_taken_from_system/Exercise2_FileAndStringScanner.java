package inputs_taken_from_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2_FileAndStringScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		// By using file :  find max number from a and b
		File file = new File("C:\\Users\\Sonali\\Desktop\\codeouter\\Course JAVA\\JAVA\\src\\inputs_taken_from_system\\input.txt");

        Scanner fileScanner = new Scanner(file);
        int a = fileScanner.nextInt();
        int b = fileScanner.nextInt();
        
        int max  = a > b ? a : b;
		
        System.out.println("Maxmimum number is : " + max);
		
		fileScanner.close();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		// By using string  : check number is odd or even
		String nos = "100";
		Scanner stringScanner = new Scanner(nos);
		
		int c = stringScanner.nextInt();
		
		String check = c % 2 == 0 ? "even" : "odd";
		System.out.println(nos + " is " + check + " number.");
		
		stringScanner.close();
	}
}
