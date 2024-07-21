package exception_handling;

import java.lang.reflect.Field;

class MyClass{
	 private int a = 10;
}

public class IllegalAccessEx {

	public static void main(String[] args) {
		
		try {
            // Create an instance of MyClass
            MyClass obj = new MyClass();
            
            // Get the privateField field using reflection
            Field field = MyClass.class.getDeclaredField("a");
            
            // Attempt to access the private field directly (which is not allowed)
            // This will throw an IllegalAccessException
            Object value = field.get(obj);
            System.out.println(value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error accessing field: " + e.getMessage());
        }
	}

}
