package java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        /**
         * Create a list and filter all even number  from the list
         *
         */
        List<Integer> list  = List.of(2,3,8,4,5);
        List<Integer> list1   = new ArrayList<>();
        // this is one of the way to create a list but then you can not add any number to it

        /**
         * this is one of the way to figure out the integer even from the list .
         * this code is without stream
         */
//        for(Integer i:list){
//            if(i%2==0){
//                list1.add(i);
//            }
//
//        }
//        System.out.println(list1);
//        System.out.println(list);

/**
 * this is one of the way of doing this
 */
       Stream<Integer> stream =  list.stream();
        List<Integer>list2  = stream.filter(i->i%2==0).collect(Collectors.toList());


        /**
         * this is the more precise way but both are same
         *
         */

        List<Integer>list3 = list.stream().filter(i->i%2==0).collect(Collectors.toList());







        // question :- find the number from the list which are greater then the 5

        List<Integer>list4 = list.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(list4);




    }



}
