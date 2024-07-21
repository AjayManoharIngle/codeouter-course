package collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Allow duplicates, may null values, preserve insertion order, random access, low performance as copied old array
		// thread safe, all method is sync 
		// best choice - if want to retrieve element 
		// worst choice - if want to manipulation like add, delete 
		
		// Noraml vector without generic : contains any type of data heterogeneous data 
		Vector list = new Vector();
		list.add(1);
		list.add("Ajay");
		list.add(90.9);
		list.add('A');
		list.add(null);
		list.add(false);
		System.out.println("Normal array wothout type : " + list);
		
		// Vector with capacity as constructor : create vector with intial capcity 
		Vector list2 = new Vector();
		System.out.println("Intial Capacity : " + list2.capacity());
		list2.add(10);list2.add(20);list2.add(10);list2.add(20);list2.add(10);list2.add(20);list2.add(10);list2.add(20);list2.add(10);list2.add(20);list2.add(10);list2.add(20);
		// nc = intail capacity *2 = 20
		System.out.println("New Capacity : " + list2.capacity());
		
		Vector list5 = new Vector(2,3);
		list5.add(20);
		list5.add(40);
		System.out.println("Intial Capacity list5 : " + list5.capacity());
		list5.add(50);
		// nc = specified capacity + capcity increment
		System.out.println("New Capacity list5: " + list5.capacity());
		
		Vector list6 = new Vector(2);
		list6.add(20);
		list6.add(40);
		System.out.println("Intial Capacity list6 : " + list6.capacity());
		list6.add(50);
		// nc = specified capacity * 2 = 4
		System.out.println("New Capacity list6: " + list6.capacity());
		
		// ArrayList with collection as constructor = provide any collection to arrayList
		Vector list3 = new Vector(Arrays.asList("1",2,99.0));
		System.out.println("ArrayList with constructor as collection list : " + list3);
		
		Vector list4 = new Vector(list2);
		System.out.println("ArrayList with constructor as collection list : " + list4);		
	}
}
