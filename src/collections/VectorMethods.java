package collections;

import java.util.Vector;
import java.util.Arrays;
import java.util.List;

public class VectorMethods {

	public static void main(String[] args) {
		// 1. boolean add(Object o)
        Vector<String> Vector = new Vector<>();
        Vector.add("Shubh");
        System.out.println(Vector); // Output: [Shubh]

        // 2. boolean addAll(Collection c)
        Vector<String> list1 = new Vector<>();
        List<String> list2 = Arrays.asList("A", "B", "C");
        List<String> list = Arrays.asList("P", "Q", "R");
        list1.addAll(list2);
        list1.addAll(list);
        System.out.println(list1); // Output: [A, B, C,P,Q,R]

        // 3. boolean addAll(int index, Collection c)
        Vector<String> list3 = new Vector<>(Arrays.asList("X", "Y", "Z"));
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
        Vector<String> list4 = new Vector<>(Arrays.asList("m","A","A", "B", "C","A"));
        list4.set(1, "X");
        System.out.println(list4); // Output: [m, X, A, B, C, A]

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
        // Create an Vector
        Vector<Integer> numbers = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        // Create another collection to retain elements
        Vector<Integer> retainList = new Vector<>(Arrays.asList(2, 4, 6));
        // Retain only the elements present in retainList
        boolean result = numbers.retainAll(retainList);
        // Print the result
        System.out.println("Result of retainAll operation: " + result);
        System.out.println("Vector after retainAll operation: " + numbers);
        
        // 15. get first element 
        int firstEle = numbers.firstElement();
        System.out.println("Get first ele : " + firstEle);
        
        // 16. get last element
        int lastEle = numbers.lastElement();
        System.out.println("last first ele : " + lastEle);
        
        // 17. get element
        int getEle = numbers.elementAt(0);
        System.out.println("Elemement at index 2 : " + getEle);
        
        // 18. copy into array 
        Integer a[] = new Integer[numbers.size()];
        numbers.copyInto(a);
        System.out.println(Arrays.toString(a));
        
	}

}
