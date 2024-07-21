package collections;

import java.util.Vector;
import java.util.Arrays;

class Laptop1 {
	
	int lid;
	String lbrand;
	int price;
	
	public Laptop1(int lid, String lbrand,int price) {
		this.lid = lid;
		this.lbrand = lbrand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop1 [lid=" + lid + ", lbrand=" + lbrand + ", price=" + price + "]";
	}
	
}

public class VectorWithGenerics {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		// list.add(1); // compile time error 
		list.add("Ajay");
		list.add("Vijay");
		list.add("Sonlai");
		System.out.println(list);
		
		//Vector<Integer> list2 = new Vector<>(Arrays.asList("1","2",2)); // complie time error
		 Vector<Integer> list2 = new Vector<>(Arrays.asList(1,2,3));
		 System.out.println(list2);
		 
		 // user defined Vector
		 Vector<Laptop1> listOfLaptop1s  = new Vector<>();
		 listOfLaptop1s.add(new Laptop1(1,"HP",50000));
		 listOfLaptop1s.add(new Laptop1(2,"Dell",90000));
		 System.out.println(listOfLaptop1s.toString());
	}
}
