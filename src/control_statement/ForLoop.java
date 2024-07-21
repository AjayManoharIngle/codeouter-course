package control_statement;

public class ForLoop {

	public static void main(String[] args) {
		
		// The for loop in Java is used when you know in advance 
		// how many times you want to iterate over a block of code.
		
		// Task1 : Print 1 to 5
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("++++++++++++++++++++++");
		
		// initial : i=1
		// cond = 1<=5  -> 1 , i=2
		// 2<=5 -> 2, i=3
		// 3<=5 -> 3, i=4
		// 4<=5 -> 4, i=5
		// 5<=5 -> 5, i=6
		// 6<=5 stop
		
		int i=1;
		for(;i<=5;) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("+++++++++++++");
		
		//Task 2: Print even number
		for(int j=0;j<=10;j=j+2) {
			System.out.print(j + " ");
		}
		System.out.println(" ");
		System.out.println("+++++++++++++++++++++");
		
		//Task 3 : Print multiplication table.
		int n = 5;
		for(int j=1;j<=10;j=j+1) {
			System.out.println(n + " * " + j + " = " + (n*j) );
		}
		
		System.out.println("+++++++++++++++++++++");
		
		// Task 4 : Sum of digits = 12345 = 15
		int no = 12345;
		int sum=0;
		int copy = no;
		for(;no!=0;no=no/10) {
			sum += no%10;
		}
		System.out.println("Sum of " + copy + " is : " + sum);
		
	}
}
