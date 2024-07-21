package oops.polymorphism;

class Message1{
	String msg;
	
	public Message1(String msg) {
		this.msg = msg;
	}
	
	public void send(int noOfSent) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people.");
	}
	
	public void send(double percentageNoOfSent) {
		percentageNoOfSent = percentageNoOfSent * 100;
		System.out.println("Alert message : " + this.msg + " is sent to " + percentageNoOfSent + " people.") ;
	}
}

public class Excercise1_DataTypeParameter {

	public static void main(String[] args) {
		
		Message1 Wishmsg = new Message1("Happy birthday !");
		Wishmsg.send(10);
		
		Message1 alertMsg = new Message1("Please go out !");
		alertMsg.send(0.5);
	}
}
