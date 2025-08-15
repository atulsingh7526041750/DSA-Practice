package java8features.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {
    public static void main(String[] args) {


        findHighestLengthWord();

        List<Employee> employees = List.of(
                new Employee("John", 60000),
                new Employee("Alice", 45000),
                new Employee("Bob", 70000)
        );

        List<String> collect = employees.stream().filter(employee -> employee.salary > 4000).map(employee -> employee.name).collect(Collectors.toList());
        System.out.println(collect);



        String str = "assdvdjsdvadjdsfsadfasd";



    }

    public static void findHighestLengthWord(){
        String str = "Atul singh from varanasi";


        String s = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        String s1 = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(0).findFirst().get();

        System.out.println(s);



    }

    public static void removeDuplicate(){
        String str = "aufglbghjvddldvnelrve";










    }
}


class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
