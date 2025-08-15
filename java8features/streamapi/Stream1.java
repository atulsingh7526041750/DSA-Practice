package java8features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);

        // by using array we can create the stream
        Integer[]arr = {100,200,300};


        Stream<Integer>stream = Arrays.stream(arr);


        Stream<String> stream1 = Stream.of("Atul","sjbfa","kadfbsd");




      // by using collections we can create the stream
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(3000);
        list.add(4000);
        list.add(6000);
        list.add(9000);
        list.add(5000);

//        Stream<Integer>stream1 = list.stream();





//
        long count = list.stream().filter(i -> i > 1000).count();
//        System.out.println(count);




    }







    }


