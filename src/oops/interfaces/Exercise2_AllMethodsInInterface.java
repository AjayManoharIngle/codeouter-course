package oops.interfaces;

interface MyInterface {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method in MyInterface");
    }

    // Default method
    default void defaultMethod() {
        privateMethod(); // Calling private method from default method
        System.out.println("This is a default method in MyInterface");
    }

    // Abstract method
    void abstractMethod();
}

class MyClass implements MyInterface {
    // Implementing abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass");
    }

    // Overriding default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass");
        MyInterface.super.defaultMethod(); // Calling default method from overridden method
    }
}

public class Exercise2_AllMethodsInInterface {

	public static void main(String[] args) {
		// create my interface and implement all methods in interfaces
		
		 // Calling static method of MyInterface
        MyInterface.staticMethod();

        // Creating instance of MyClass
        MyClass obj = new MyClass();

        // Calling default method of MyInterface through MyClass instance
        obj.defaultMethod();

        // Calling abstract method of MyInterface through MyClass instance
        obj.abstractMethod();
	}

}
