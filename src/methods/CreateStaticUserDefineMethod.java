package methods;

public class CreateStaticUserDefineMethod {

	// user define methods with static - no need of object create of current class
	public static void main(String[] args) {
		
		// Types : 
		// No return type, No argument
		// No return type, With argument
		// With return type, No argument
		// With return type, With argument
		
		// Sum of two numbers : 
		//1. No return type, No argument
		sum1();
		
		//2. No return type, With argument
		sum2(10,20);
		
		//3. With return type, No argument
		int sum = sum3();
		System.out.println("With return type, No argument - Sum :" + sum);
		
		//4. With return type, No argument
		int sums = sum4(10,20);
		System.out.println("With return type, With argument - Sum :" + sums);
		
	}
	
	static int sum4(int a, int b) {
		int sum = a+b;
		return sum;
	}

	static int sum3() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		return sum;
	}

	static void sum2(int a, int b) {
		int sum = a+b;
		System.out.println("No return type, With argument - Sum :" + sum);	
	}
	
	static void sum1() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("No return type & No argument - Sum :" + sum);	
	}

}
