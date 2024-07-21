package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		
		// only used to read elements 
		
		Vector<Integer> v = new Vector<Integer>(); 
		for(int i = 0; i <= 10; i++){
		     v.addElement(i); 
		} 
		System.out.println(v); 
		
		Enumeration<Integer> e = v.elements(); 
		while(e.hasMoreElements()){ 
		    Integer i = (Integer)e.nextElement(); // Direct type casting in one step. 
		    System.out.println(i); 
		}   
	}

}
