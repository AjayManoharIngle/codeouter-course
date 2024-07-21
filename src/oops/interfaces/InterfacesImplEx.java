package oops.interfaces;


interface HDFCBank1{
	
	String name = "HDFC";
	abstract void processPayment(double amount);
}

interface IDFCBank1{
	
	String name = "IDFC";
	void requestPayment(double amount);
}

class Amazon1 implements HDFCBank1,IDFCBank1{
	
	Amazon1(){
		System.out.println("Amazon using HDFC bank credit card methods...");
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing HDFC Credit Card payment of amount: " + amount);
	}

	@Override
	public void requestPayment(double amount) {
		System.out.println("Processing IDFC Credit Card payment of amount: " + amount);
	}
}

class Flipcart1 implements HDFCBank1 {
	
	Flipcart1(){
		System.out.println("Flipcart using HDFC bank credit card methods...");
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing HDFC Credit Card payment of amount: " + amount);
	} 
}

public class InterfacesImplEx {

	public static void main(String[] args) {
		// It is lossly coupled ..you change something in interface it will not reflect to it's implementation.
		// it achieve multiple inheritance concept.
		// claen Code and flexible  
		
		Amazon1 amazon1 = new Amazon1();
		amazon1.processPayment(10000);
		amazon1.requestPayment(22000);
		
		Flipcart1 flipcart1 = new Flipcart1();
		flipcart1.processPayment(3000);
	}
}
