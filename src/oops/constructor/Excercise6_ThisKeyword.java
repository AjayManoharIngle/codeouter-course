package oops.constructor;

class Children{
	
	int age;
	String name;
	char grade;
	
	public Children(int age, String name, char grade) {
		this.age = age;
		this.name = name;
		this.grade = grade;
	}
	
	public Children() {}
	
	Children returnChildrenObj() {
		return this;
	}
	
	int noOfChildrenWithAgeMorethan18(Children[] childrens) {
		int c = 0;
		for(Children i : childrens) {
			if(i.age > 18) {
				System.out.println("Student Name : " + i.name);
				c++;
			}
		}
		return c;
	}
}

public class Excercise6_ThisKeyword {

	public static void main(String[] args) {
		
		// Children Data - take age,name,grade
		// how much 18+ Childrens ?
		
		Children s1 = new Children(20,"Ajay",'A');
		Children s2 = new Children(15,"Vijay",'C');
		Children s3 = new Children(19,"Ankur",'B');
		Children s4 = new Children(13,"Nikhil",'A');
		
		int noOfChild = new Children().returnChildrenObj()
		.noOfChildrenWithAgeMorethan18(new Children[] {s1,s2,s3,s4});
		System.out.println("No of childern whoes age more than 18 : " + noOfChild);
	}
}
