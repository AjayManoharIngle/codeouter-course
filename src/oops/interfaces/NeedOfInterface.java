package oops.interfaces;

class HDFCBank{
	
	String name = "HDFC";
	
	public HDFCBank() {
		System.out.println("HDFC bank credit card logic class...");
	}
	
	public void processPayment(double amount) {
        // HDFC-specific payment processing logic
        System.out.println("Processing HDFC Credit Card payment of amount: " + amount);
    }
}

class Amazon extends HDFCBank {
	
	Amazon(){
		System.out.println("Amazon using HDFC bank credit card methods..." + super.name);
	}

	@Override
	public void processPayment(double amount) {
		super.processPayment(amount);
	} 
}

class Flipcart extends HDFCBank {
	
	Flipcart(){
		System.out.println("Flipcart using HDFC bank credit card methods..." + super.name);
	}

	@Override
	public void processPayment(double amount) {
		super.processPayment(amount);
	} 
}

public class NeedOfInterface {

	public static void main(String[] args) {
		
		// Abstract class is not fully 100% acheive abstraction.
		// cause abstract class is with abstract methods and concrete method. 
		
		// interface only have abstract methods  and not have constants.
		
		// We have shopping site like amazon, flipcart, myntra etc.. all mants to integreate HDFC bank credit option
		// in their site. how do they do it at their end both side.
		
		HDFCBank amazon = new Amazon();
		amazon.processPayment(1000);
		System.out.println("+++++++++++++++++++++++++");
		
		HDFCBank flipcart = new Flipcart();
		flipcart.processPayment(3000);
		
		// Problems :
		// It is tightly couple means if change something in HDFCBANK class then all subclasses needs to change.
		// if amazon or flipcart wants to change payment logic they will not able to do cause tightly coupled.
		// In this we amazon will not able to intgerate logic of paymnets by multiple banks only allow one bank
		
	}
}
