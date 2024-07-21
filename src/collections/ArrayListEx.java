package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

	public static void main(String[] args) {
		// Allow duplicates, may null values, preserve insertion order, random access, low performance as shifting internally
		// multiple threads can perform not thread safe, all method is no sync 
		// best choice - if want to retrieve element 
		// worst choice - if want to manipulation like add, delete 
		
		// Noraml ArrayList without generic : contains any type of data heterogeneous data 
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Ajay");
		list.add(90.9);
		list.add('A');
		list.add(null);
		list.add(false);
		System.out.println("Normal array wothout type : " + list);
		
		// ArrayList with capacity as constructor : create arraylist with intial capcity 
		ArrayList list2 = new ArrayList(2);
		list2.add(10);
		list2.add(20);
		// nc = ((2*3)/2) + 1 = 4
		list2.add(30);
		System.out.println("Current size of arrayList : " + list2.size());
		
		// ArrayList with collection as constructor = provide any collection to arrayList
		ArrayList list3 = new ArrayList(Arrays.asList("1",2,99.0));
		System.out.println("ArrayList with constructor as collection list : " + list3);
		
		ArrayList list4 = new ArrayList(list2);
		System.out.println("ArrayList with constructor as collection list : " + list4);
	}

}
