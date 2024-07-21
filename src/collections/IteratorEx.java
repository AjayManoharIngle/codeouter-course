package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// It is used to read & remove both operations 
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int i = 0; i <= 8; i++){  
		     al.add(i); 
		} 
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator(); 
		while(itr.hasNext()){ 
		   Integer i = itr.next(); // Here, Type casting does not require due to using of generic with Iterator. 
		   System.out.println(i); 

		   if(i % 2 != 0) 
		     itr.remove(); 
		 } 
		   System.out.println(al); 
	} 
}
