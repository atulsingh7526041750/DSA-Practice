package java8features.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        //filter
        /**
         * filter method takes a predicate
         * predicate means boolean valued functions
         * on the basis of that it returns the value
         *
         */

//        List<String> stringList  = List.of("Atul","Ashok","Alok","Pritam");
//        List<String> stringList1 = stringList.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
//        System.out.println(stringList1);

        //map

        List<Integer> list = List.of(2,3,3,5);
//        list.stream().map(e->e*e).forEach(s-> System.out.println(s));
//        List<Integer>list1 = list.stream().map(e->e*e).collect(Collectors.toList());
//        System.out.println(list1);
        Stream<Integer>stream  = list.stream();
        List<Integer>list1 = stream.map(e->e*e).collect(Collectors.toList());
        /**
         * By using mao we can perform operation on each element
         *
         */
    }
}
