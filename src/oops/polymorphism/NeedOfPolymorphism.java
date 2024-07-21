package oops.polymorphism;

class Message{
	String msg;
	
	public Message(String msg) {
		this.msg = msg;
	}
	
	public void sendWishMessage(int noOfSent) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people.");
	}
	
	public void sendAlertMessage(double percentageNoOfSent) {
		percentageNoOfSent = percentageNoOfSent * 100;
		System.out.println("Alert message : " + this.msg + " is sent to " + percentageNoOfSent + " people.") ;
	}
}

public class NeedOfPolymorphism {

	public static void main(String[] args) {
		
		// We have two ways to send message - wish - 10, alert - 3% people
		// Both having same behavior but different implementation 
		// But we are using differnt methods for same functionalities.
		
		Message wishMsg = new Message("Happy birthday !");
		wishMsg.sendWishMessage(10);
		
		Message alertMsg = new Message("Please go out !");
		alertMsg.sendAlertMessage(0.03);
		
	}
}
