package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// 1. boolean add(Object o)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Shubh");
        System.out.println(arrayList); // Output: [Shubh]

        // 2. boolean addAll(Collection c)
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = Arrays.asList("A", "B", "C");
        List<String> list = Arrays.asList("P", "Q", "R");
        list1.addAll(list2);
        list1.addAll(list);
        System.out.println(list1); // Output: [A, B, C,P,Q,R]

        // 3. boolean addAll(int index, Collection c)
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        list3.addAll(1, Arrays.asList("M", "N"));
        System.out.println(list3); // Output: [X, M, N, Y, Z]

        // 4. void add(int index, Object o)
        list3.add(2, "O");
        System.out.println(list3); // Output: [X, M, O, N, Y, Z]

        // 5. boolean remove(Object o)
        list3.remove("O");
        System.out.println(list3); // Output: [X, M, N, Y, Z]

        // 6. void remove(int index)
        list3.remove(0);
        System.out.println(list3); // Output: [M, N, Y, Z]

        // 7. void clear()
        list3.clear();
        System.out.println(list3); // Output: []

        // 8. void set(int index, Object o)
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("m","A","A", "B", "C","A"));
        list4.set(1, "X");
        System.out.println(list4); // Output: [A, X, C]

        // 9. Object get(int index)
        System.out.println(list4.get(2)); // Output: A

        // 10. int size()
        System.out.println(list4.size()); // Output: 6

        // 11. boolean contains(Object o)
        System.out.println(list4.contains("X")); // Output: true

        // 12. int indexOf(Object o)
        System.out.println(list4.indexOf("A")); // Output: 2

        // 13. int lastIndexOf(Object o)
        System.out.println(list4.lastIndexOf("A")); // Output: 5
        
        // 14. boolean retainAll(Collection<?> c) => Retains only the elements in the list that are contained in the specified collection.
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Create another collection to retain elements
        ArrayList<Integer> retainList = new ArrayList<>(Arrays.asList(2, 4, 6));
        // Retain only the elements present in retainList
        boolean result = numbers.retainAll(retainList);
        // Print the result
        System.out.println("Result of retainAll operation: " + result);
        System.out.println("ArrayList after retainAll operation: " + numbers);
        
        
	}

}
