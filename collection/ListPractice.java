package collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        ListPractice freqencyElement = new ListPractice();
        freqencyElement.convertArrayToList();
    }

/**
 * List Implementation here
 *
 */
public void listImpl(){



    List<Integer> list  = new ArrayList<>();
    List<Integer> list1 = new LinkedList<>();
    List<Integer> list2 = new Vector<>();
    List<Integer> list3 = new Stack<>();


    /**
     * To add the value into the list we can use this method
     *
     *
     */
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("this is the value"+list);

    // add(index, element) – add at specific index
    list.add(1, 15);
    System.out.println("After add at index: " + list);  // [10, 15, 20, 30]

    // get(index) – get element at index
    System.out.println("Element at index 2: " + list.get(2));  // 20

    // set(index, element) – update element at index
    list.set(2, 25);
    System.out.println("After set(): " + list);  // [10, 15, 25, 30]

// remove(Object)
    list.remove(Integer.valueOf(25));
    System.out.println("After remove(Object): " + list);  // [10, 30]

    // contains(element)
    System.out.println("Contains 30? " + list.contains(30));  // true

    // isEmpty()
    System.out.println("Is list empty? " + list.isEmpty());  // false


    // size()
    System.out.println("Size: " + list.size());  // 2

    // indexOf(element)
    list.add(10);
    list.add(40);
    list.add(10);
    System.out.println("List: " + list);  // [10, 30, 10, 40, 10]
    System.out.println("indexOf(10): " + list.indexOf(10));  // 0

    // lastIndexOf(element)
    System.out.println("lastIndexOf(10): " + list.lastIndexOf(10));  // 4

    // subList(fromIndex, toIndex)
    System.out.println("subList(1, 4): " + list.subList(1, 4));  // [30, 10, 40]

    Iterator<Integer> iterator = list.iterator();

    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }

}


private void convertArrayToList(){

    /**
     * this is how you can do for non primitive data types values
     */
    String[] array = {"Apple", "Banana", "Cherry"};
    System.out.println(Arrays.toString(array));
    List<String> list = new ArrayList<>(Arrays.asList(array));
    System.out.println(list);

    /**
     * This is how you can do this for primitive data types.
     */
    Integer[] arr = {1,2,3,4};
    List<Integer>list1 = new ArrayList<>();
    list1 = Arrays.asList(arr);
//    for (int num:arr
//         ) {
//        list1.add(num);
//
//    }
    System.out.println("this is the list"+list1);
}


public void convertListToArray(){
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

// Convert to array
    String[] array = list.toArray(new String[0]);
    System.out.println("Array: " + Arrays.toString(array));

// for integer or primitive data type
    List<Integer> list1 = Arrays.asList(10, 20, 30);
    Integer[] arr = list1.toArray(new Integer[0]);
    System.out.println("Array: " + Arrays.toString(arr));

}
}
