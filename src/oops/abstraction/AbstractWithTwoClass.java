package oops.abstraction;

abstract class Bank2 {
	
	String bankName;
	double interestRate;

	public Bank2(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	// Concrete method
	void display(){
		System.out.println("Bank Name : " + this.bankName);
	}
	
	abstract public double getInterestRateOfBank();
}

abstract class SBI2 extends Bank2{
	
	String branchName;

	public SBI2(String bankName,String branchName) {
		super(bankName);
		this.branchName = branchName;
	}

	@Override
	public double getInterestRateOfBank() {
		return 8.7d;
	}
	
	abstract void displaySBIDetail();
}

class SBI3 extends SBI2{

	public SBI3() {
		super("SBI","Chembur");
	}

	@Override
	void displaySBIDetail(){
		System.out.println("SBI branch Name : " + branchName);
	}
}

class AXIS2 extends Bank2{

	public AXIS2(String bankName) {
		super(bankName);
	}

	@Override
	public double getInterestRateOfBank() {
		return 7.8d;
	}
}

public class AbstractWithTwoClass {

	public static void main(String[] args) {
		
		// We can not create object of abstract class.
		
		SBI2 sbi3 = new SBI3();
		sbi3.displaySBIDetail();
		sbi3.display();
		System.out.println("SBI interest rate is " + sbi3.getInterestRateOfBank());
		
		Bank2 axis = new AXIS2("axis");
		axis.display();
		System.out.println("Axis interest rate is " + axis.getInterestRateOfBank());
	}
}
