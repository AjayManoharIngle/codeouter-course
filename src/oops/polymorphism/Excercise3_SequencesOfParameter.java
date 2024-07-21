package oops.polymorphism;

class Message3{
	String msg;
	
	public Message3(String msg) {
		this.msg = msg;
	}
	
	public void send(int noOfSent,String msgType) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people." + " with messgae : " + msgType);
	}
	
	public void send(String msgType,int noOfSent) {
		System.out.println("Wish message : " + this.msg + " is sent to " + noOfSent + " people." + " with messgae : " + msgType);
	}
}

public class Excercise3_SequencesOfParameter {

	public static void main(String[] args) {
		
		Message3 wishMsg = new Message3("Happy Birthday !");
		wishMsg.send(10,"Wish1");
		wishMsg.send(20,"wish2");
		
	}
}
