package generalquestion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLClientInfoException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InterfacePractice extends A {

    void fun() throws FileNotFoundException {
        System.out.println("asdhjbfsd");

    }



}
class A{
    void fun() throws Exception {
        System.out.println("asdhjbfsd");

    }
}


class Parent {
    void test() throws IOException { }
}

class Child extends Parent {



    @Override
    void test() throws FileNotFoundException {

//        try {
//            String s = null;
//            System.out.println(s.length());
//        } catch (RuntimeException | IndexOutOfBoundsException e) {
//            System.out.println("Null or Array index issue");
//        }


    } // OK (subclass of IOException)
    // void test() throws Exception { } // ❌ broader checked exception not allowed
}


class Check{
    @Override
    public String toString() {
        return "Check{" +
                "a=" + a +
                '}';
    }

    private  int a;

    public Check(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        HashMap<Check,Integer>map = new HashMap<>();
        Check check = new Check(102);
        Check check1 = new Check(103);
        map.put(check1,10);
        map.put(check,10);
        System.out.println(map);

    }



    public boolean equals(){
        return true;
    }

}

class Emp {
    private int Salary;

    public Emp(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Salary == emp.Salary;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    public static void main(String[] args) {
        Emp emp = new Emp(10);
        Emp emp1 = new Emp(20);
        Map<Emp,Integer> empIntegerMap=new HashMap<>();
        empIntegerMap.put(emp,100);
        System.out.println();
        System.out.println(empIntegerMap.get(emp));
        emp.setSalary(200);
        System.out.println(empIntegerMap.get(emp));
    }

}
