package designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SamosaMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Samosa samosa = Samosa.getSamosa();
//        Samosa samosa1 = Samosa.getSamosa();
///**
// * we will find that both are having the same hash code that means a single object is created and the referec
// * of the object is being passed.
// */
//        System.out.println(samosa.hashCode());
//        System.out.println(samosa1.hashCode());


        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

    }
}
