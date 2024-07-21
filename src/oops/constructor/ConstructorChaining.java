package oops.constructor;

class College {
	
	String name;
	int year;
	
	College(){
		System.out.println("College Information : ");
	}
	
	College(String name, int year){
		this(name);
		this.name = name;
		this.year = year;
	}
	
	College(String name){
		this();
		System.out.println("College name : " + name);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		// Constructor chaining in Java is a technique of calling one constructor from within another constructor.
		
		// College(String name, int year) -> College(String name) -> College()
		
		College college = new College("VIT",2013);
		System.out.println(college.name + " : " + college.year);
	}

}
