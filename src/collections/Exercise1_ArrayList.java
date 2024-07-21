package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1_ArrayList {

	public static void main(String[] args) {
		
		// reverse arraylist
		List<Integer> list = Arrays.asList(1,29,30,4,5);
		
		// Method 1 : 
		ArrayList<Integer> revList = new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			revList.add(list.get(i));
		}
		System.out.println(revList);
		revList.clear();
		
		// Method 2 : 
		for(int i=0,j=list.size()-1;i<j;i++,j--) {
			swap(list,i,j);
		}
		System.out.println(list);
	}

	private static void swap(List<Integer> list, int i, int j) {
		int t = list.get(i);
		list.set(i,list.get(j));
		list.set(j,t);
	}
}
