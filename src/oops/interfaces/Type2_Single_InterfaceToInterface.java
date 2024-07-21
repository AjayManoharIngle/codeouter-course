package oops.interfaces;

interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

public class Type2_Single_InterfaceToInterface {

	public static void main(String[] args) {
		
		// Single Inheritance
        Dog dog = new Dog() {
            @Override
            public void eat() {
                System.out.println("Dog can eat");
            }

            @Override
            public void bark() {
                System.out.println("Dog can bark");
            }
        };
        dog.eat();
        dog.bark();
	}
}
