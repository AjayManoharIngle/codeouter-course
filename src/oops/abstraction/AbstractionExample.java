package oops.abstraction;

abstract class Bank1 {
	
	String bankName;
	double interestRate;

	public Bank1(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	// Concrete method
	void display(){
		System.out.println("Bank Name : " + this.bankName);
	}
	
	abstract public double getInterestRateOfBank();
}

class SBI1 extends Bank1{

	public SBI1(String bankName) {
		super(bankName);
	}

	@Override
	public double getInterestRateOfBank() {
		return 8.7d;
	}
}

class AXIS1 extends Bank1{

	public AXIS1(String bankName) {
		super(bankName);
	}

	@Override
	public double getInterestRateOfBank() {
		return 7.8d;
	}
}


public class AbstractionExample {

	public static void main(String[] args) {
		
		// if abstract method present in class then class must be abstract
		// we add abstract method in parent then all child extends parent must be override abstract method.
		
		Bank1 sbi = new SBI1("SBI");
		sbi.display();
		System.out.println("SBI ineterst rate is " + sbi.getInterestRateOfBank());
		
		Bank1 axis = new AXIS1("Axis");
		axis.display();
		System.out.println("SBI ineterst rate is " + axis.getInterestRateOfBank());
	}
}
