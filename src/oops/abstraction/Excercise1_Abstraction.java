package oops.abstraction;

abstract class Calculator {
	
	int res = 0;
	abstract int calculate(int a, int b);
	
	void result(String name,int res) {
		System.out.println(name + " result is " + (res));
	}
}

class Addition extends Calculator{

	@Override
	int calculate(int a, int b) {
		return a+b;
	}
	
}

class Substarction extends Calculator{

	@Override
	int calculate(int a, int b) {
		return a-b;
	}
	
}

class Multiplication extends Calculator{

	@Override
	int calculate(int a, int b) {
		return a*b;
	}
	
}

public class Excercise1_Abstraction {

	public static void main(String[] args) {
		
		// create calculator class with three subclass like add,mul, sub etc.
		Calculator add = new Addition();
		int rAdd = add.calculate(10, 20);
		add.result("add",rAdd);
		
		Calculator mul = new Multiplication();
		int rMul = mul.calculate(10, 20);
		mul.result("mul",rMul);
		
		Calculator sub = new Substarction();
		int rSub = sub.calculate(10, 20);
		sub.result("sub",rSub);
	}
}
