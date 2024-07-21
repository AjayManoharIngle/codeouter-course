package oops.constructor;

public class Excercise4_ConstructorWithArray {
	
	int a[]; 
	
	Excercise4_ConstructorWithArray(int arr[]){
		a = arr;
		sumArr(a);
	}

	private void sumArr(int[] arr) {
		int s = 0;
		for(int i : arr) {
			s += i;
		}
		System.out.println("Sum : " + s);
	}

	public static void main(String[] args) {
		
		// Sum of all numbers in array
		Excercise4_ConstructorWithArray e = new Excercise4_ConstructorWithArray(new int[] {10,20,30,40,50});
	}
}
