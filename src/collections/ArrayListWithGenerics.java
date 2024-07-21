package collections;

import java.util.ArrayList;
import java.util.Arrays;

class Laptop {
	
	int lid;
	String lbrand;
	int price;
	
	public Laptop(int lid, String lbrand,int price) {
		this.lid = lid;
		this.lbrand = lbrand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lbrand=" + lbrand + ", price=" + price + "]";
	}
	
}

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		// list.add(1); // compile time error 
		list.add("Ajay");
		list.add("Vijay");
		list.add("Sonlai");
		System.out.println(list);
		
		// ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList("1","2",2)); // complie time error
		 ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		 System.out.println(list2);
		 
		 // user defined arraylist
		 ArrayList<Laptop> listOfLaptops  = new ArrayList<>();
		 listOfLaptops.add(new Laptop(1,"HP",50000));
		 listOfLaptops.add(new Laptop(2,"Dell",90000));
		 System.out.println(listOfLaptops.toString());
	}
}
