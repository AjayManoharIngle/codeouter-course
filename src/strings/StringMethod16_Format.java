package strings;

public class StringMethod16_Format {

	public static void main(String[] args) {
		
		// format -> returns the formatted string.
		
		String name = "Ajay";
		String output1 = String.format("Print your name : %s",name);
		System.out.println(output1);
		
		int age = 21;
		String output2 = String.format("Print your age : %d",age);
		System.out.println(output2);
		
		float marks =99.81f;
		String output3 = String.format("Print your age : %f",marks);
		System.out.println(output3);
		
		String output4 = String.format("Print your age up to 2 decimal : %.2f",marks);
		System.out.println(output4);
		
		String output5 = String.format("Print your age up to 4 decimal : %.4f",marks);
		System.out.println(output5);
	}
}
