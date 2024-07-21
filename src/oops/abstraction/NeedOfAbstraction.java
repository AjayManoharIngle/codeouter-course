package oops.abstraction;

class Bank {
	
	String bankName;
	double interestRate;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	// Concrete method
	void display(){
		System.out.println("Bank Name : " + this.bankName);
	}
	
	// Interest rate cal - 
	// Probalem - this method should not be visible to all Banks 
	// every banks has their own way to calculate interst rate.
	public double getInterestRateOfBank(double interestRate) {
		// Calculations of banks interest rate
		return interestRate;
	}
}

class SBI extends Bank{

	public SBI(String bankName) {
		super(bankName);
	}
}

class AXIS extends Bank{

	public AXIS(String bankName) {
		super(bankName);
	}
}

public class NeedOfAbstraction {

	public static void main(String[] args) {
		
		// Abstraction is hiding implementation of details and only showing impotant details to users.
		
		// Probelm if not used abstraction : 
		// 1. less code reuseblities - cause subclasses used parent method which is very tighly coupled means it very 
		// connected to that implementation.
		// 2. Reduced extensibility - if we changes interest rate cal in parent then it will affect to all methods in all banks
		// 3. Code duplicate - bank implemnt method which is not suitable for all banks evry banks cal interst rate diffently.
		
		
		
	}
}
