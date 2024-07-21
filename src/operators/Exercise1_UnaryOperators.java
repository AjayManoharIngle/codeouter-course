package operators;

public class Exercise1_UnaryOperators {

	public static void main(String[] args) {
		
	  int x = 5;
	  int y = 10;
	  int result;
	     
	  // Exercise 1
	  result = x++ + ++y; // 5+11 = 16 : x = 6 , y = 11
	  System.out.println("Exercise 1 Result: " + result);
	  
	  // Exercise 2
      result = --x - y--; // 5-11 = -6 : x = 5 , y = 10
      System.out.println("Exercise 2 Result: " + result);

      // Exercise 3
      result = ++x * y--; // 6*10 = 60 : x = 6, y=9
      System.out.println("Exercise 3 Result: " + result);

      // Exercise 4
      result = x++ + y++ - ++x; // 6+9-8= 7 : x = 7-->8 and y = 10
      System.out.println("Exercise 4 Result: " + result);

	}

}
