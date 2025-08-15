package java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer>list = List.of(8,4,3,4,5);
        System.out.println(list);

       List<Integer>list1 =  list.stream().map(i->(i*i)).collect(Collectors.toList());

       List<Integer> list2 = list.stream().filter(i->i>2).collect(Collectors.toList());

    list.stream().max(Integer::compareTo).orElseThrow();


//        List<Integer>list = new ArrayList<>();
//        list.add()
    }
}
