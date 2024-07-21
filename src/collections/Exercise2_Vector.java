package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Exercise2_Vector {

	public static void main(String[] args) {
		
		// store unique ele
		List<Integer> list = Arrays.asList(0,1,2,2,3,3,1,34,0,3,344);
		
		Vector<Integer> vectorsList = new Vector<>(list.size());
		
		for(int i=0;i<list.size();i++) {
			if(!vectorsList.contains(list.get(i))) {
				vectorsList.add(list.get(i));
			}
		}
		
		System.out.println("Unique ele : " + vectorsList);
	}
}
