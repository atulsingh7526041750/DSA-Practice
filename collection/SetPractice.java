package collection;

import java.util.*;

public class SetPractice {
    /**
     * No duplicates
     *
     * No guaranteed order
     *
     * Fast performance
     */
    public static void main(String[] args) {
        SetPractice setPractice = new SetPractice();
        setPractice.setImple();

    }


    public void setImple(){
        Set<String> set = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new TreeSet<>();

        set.add("1");
        set.add("2");
        set.add("3");

        for (String i:set
             ) {
            System.out.println(i);

        }
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }

}
