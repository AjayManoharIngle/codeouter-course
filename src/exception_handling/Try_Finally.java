package exception_handling;

public class Try_Finally {

	public static void main(String[] args) {
		
		// try with finally - no exception 
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("Executing finally block......");
		}
		
	}

}
