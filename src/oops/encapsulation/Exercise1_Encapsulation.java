package oops.encapsulation;

class Rectangle {
	
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
}

public class Exercise1_Encapsulation {

	public static void main(String[] args) {
		
		// Make a class ‘Rectangle’ and declare the variable length and breadth as private. 
		// One Constructor will be used for initializing the value of variables.
		
		Rectangle rt = new Rectangle(20,30); 
		int lth = rt.getLength(); 
		int bth = rt.getBreadth(); 
		   
		int Area = lth * bth; 
		System.out.println("Area: " +Area); 
		
		rt.setLength(50); 
		rt.setBreadth(60); 
		
		int ln = rt.getLength(); 
		int br = rt.getBreadth(); 
		int newArea = ln * br; 
		System.out.println("New area: " +newArea); 
	}
}
