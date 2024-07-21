package oops.encapsulation;

public class MainatableEncapsulation {

	public static void main(String[] args) {
		
		// BankAccount has balance var and deposist and withdraw methods 
		
		// let's say we want to modify the implementation of the withdraw() method to include a fee for each withdrawal.
		// Without breaking the external code that uses the BankAccount class. 
		
		 BankAccount account = new BankAccount(100.0);
	     System.out.println("Initial balance: " + account.getBalance());

	     account.withdraw(50.0);
	     System.out.println("Balance after withdrawal: " + account.getBalance());

	     account.deposit(200.0);
	     System.out.println("Balance after deposit: " + account.getBalance());   
	}
}
