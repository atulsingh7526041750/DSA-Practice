package generalquestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
public interface check {
    public void sum(String message);
}

class CheckIMpl{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        list.add(4); // Structural modification after iterator created

        while (it.hasNext()) {
            System.out.println(it.next()); // Throws ConcurrentModificationException here
        }

//      check check = (message)->{
//          System.out.println(message);
//
//
//      };
//      check.sum(",hsjbfasj");
    }

}
