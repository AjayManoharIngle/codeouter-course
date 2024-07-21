package arrays;

public class FinalArrayReferences {

	public static void main(String[] args) {
		
		// final is keyword and its value can’t be modified and it is a constant.
		
		int a[] = {1,2,3};
		final int b[] = {4,5,6};
		
		// print data of b initially
		for(int i : b) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		// move b data in a; // this is references we are putting in a to b - got error
		// b = a;
		
		// modify b content if final is wriiten to b 
		b[2] = 10;
		
		for(int i : b) {
			System.out.print(i + " ");
		}
		System.out.println(" "); 
		
		// let say if i make 'a' array as final => No problem 
		// cause we are moving from a to b and a is final it means a value we are not modifiying , we are modify data of b
		
		// put final to b : 
		// if we moved refrences of a to b -> got error 
		// if we modify content of b - >  not error
		
	}
}
