package java8features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Optional.empty;

public class StreamObject {
    public static void main(String[] args) {


        // Stream API / Collection process
        //collection / group of object



        // 1. once you have to create a blank stream
       Stream<Object> objectStream = Stream.empty();
       objectStream.forEach(e->{
               System.out.println(e);

       });



       //2. suppose you have an array of string or you have array or object or collections then you can create the stream
        // as mentioned below
        String[] str = {"Atul", "Shubham", "Shiddharth"};

        /**
         * this is one of the way of doing this
         */
        Arrays.stream(str).forEach(e->{
            System.out.println(e);
        });

        /**
         * this is the second way to do that we can use stream.of
         */
        Stream<String>stream = Stream.of(str);
        stream.forEach(e->{
            System.out.println(e);
        });



        //3 this is the third way of creating stream
        // using builder pattern
        Stream<Object> stream1  = Stream.builder().build();

        //4 this is the fourth way and is the same as
        Arrays.stream(str).forEach(e->{
            System.out.println(e);
        });



        //5 once oyu have colletions like set, list , and such type of collection this you can directly apply stream on these

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(32);

        list.stream();

    }
}
