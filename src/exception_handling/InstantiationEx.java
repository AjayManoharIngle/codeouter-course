package exception_handling;

abstract class AbstractClass{}

public class InstantiationEx {

	public static void main(String[] args) {
		
		try {
            // Trying to instantiate an abstract class
			// if AbstractClass is not abstarct then there is no error
            Object obj = AbstractClass.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Instantiation error: " + e.getMessage());
        }
	}

}
