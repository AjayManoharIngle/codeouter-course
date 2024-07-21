package oops.polymorphism;

class Message2{
	String msg;
	
	public Message2(String msg) {
		this.msg = msg;
	}
	
	public void send(int noOfSent) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people.");
	}
	
	public void send(int noOfSent,String msgType) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people." + " with messgae : " + msgType);
	}
	
	public void send(double percentageNoOfSent) {
		percentageNoOfSent = percentageNoOfSent * 100;
		System.out.println("Alert message : " + this.msg + " is sent to " + percentageNoOfSent + " people.") ;
	}
	
	public void send(double percentageNoOfSent,String msgType) {
		percentageNoOfSent = percentageNoOfSent * 100;
		System.out.println("Alert message : " + this.msg + " is sent to " + percentageNoOfSent + " people." + " with messgae : " + msgType) ;
	}
}

public class Excercise2_NoOfParameters {

	public static void main(String[] args) {
		
		Message2 wishMsg = new Message2("Happy birthday !");
		wishMsg.send(10);
		wishMsg.send(20,"Wish");
		
		Message2 alertMsg = new Message2("Please go out !");
		alertMsg.send(0.5);
		alertMsg.send(0.3, "alert");
	}
}
