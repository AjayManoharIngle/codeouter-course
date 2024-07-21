package oops.interfaces;

interface Calculator {
	void add(int a, int b);
	void sub(int a, int b);
}

class CalculatorImpl implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println(a + "+" + b + ": " + (a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a + "-" + b + ": " + (a-b));
	}
}

public class FourUseCasesOfInterfaceCall {

	public static void main(String[] args) {
		
		// Type 1 : Interface object not created.
		// Calculator cal = Calculator(); // error
		
		// Type 2 : Interface obj = child();
		Calculator cal = new CalculatorImpl();
		cal.add(10,20);
		cal.sub(20, 10);
		System.out.println("++++++++++++++++++++++++++++");
		
		// Type 3 : child class object
		CalculatorImpl calImpl = new CalculatorImpl();
		calImpl.add(30,10);
		calImpl.sub(40, 20);
		System.out.println("+++++++++++++++++++++++++++++++");
		
		// Type 4 : Anonymous - without create object of child class override methods
		Calculator cals = new Calculator() {
			@Override
			public void sub(int a, int b) {
				System.out.println("Inner : " + a + "-" + b + ": " + (a-b));
			}
			
			@Override
			public void add(int a, int b) {
				System.out.println("Inner : " + a + "+" + b + ": " + (a+b));
			}
		};
		cals.add(100,10);
		cals.sub(200,20);
	}
		
}
