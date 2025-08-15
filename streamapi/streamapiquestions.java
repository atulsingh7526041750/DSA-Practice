package streamapi;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamapiquestions {
    public static void main(String[] args) {
//        printName();

//        moderateQuestion();

        print();

    }
    public static void printName(){

        //        List<String>name = new ArrayList<>();
//        List<String>name1 = List.of("Atl","Aman");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // to print the name only
        names.stream().forEach(System.out::println);

        //to filter the name with length and print
        names.stream().filter(name->name.length()>4).forEach(System.out::println);


        //map all the case to upper case
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //Q1. Print all numbers greater than 10 from the list.
        List<Integer> numbers = Arrays.asList(5, 12, 7, 18, 3, 25);

        numbers.stream().filter(number->number>10).forEach(System.out::println);


        // Q2. Print the square of each number in the list.
        numbers.stream().map(number->number*number).forEach(System.out::println);


        // Q3. Print all strings that start with "A".
        List<String> names1 = Arrays.asList("Ankit", "Bob", "Aman", "Rita");
        names1.stream().filter(a->a.startsWith("A")).forEach(System.out::println);

        // Q4. Convert all names to lowercase and print.

       // Q5. Count how many names have more than 4 characters.
        List<String> names2 = Arrays.asList("Ram", "Shyam", "Anjali", "Raj", "Rakesh");

        long count = names2.stream().filter(a->a.length()>4).count();
        System.out.println(count);



        // Q6. Create a list of squares from a list of numbers.

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = numbers1.stream().map(a -> a * a).collect(Collectors.toList());
        System.out.println(collect);


        // Q7. Get a list of names starting with "S" in uppercase.

        List<String> names4 = Arrays.asList("Sunil", "Sam", "Raj", "Suresh", "Ravi");
        List<String> s = names4.stream().filter(a -> a.startsWith("S")).collect(Collectors.toList());
        System.out.println(s);


        //🔹 Q8. Filter strings that contain the letter "e" and collect into a list.
        List<String> words = Arrays.asList("apple", "banana", "grape", "mango", "cherry");
        words.stream().filter(a->a.contains("e")).forEach(System.out::println);

        // Q9. Count the number of even numbers in a list.
        List<Integer> numbers2 = Arrays.asList(2, 5, 6, 8, 9, 10, 11);
        numbers2.stream().filter(n->n%2==0).count();

        // Q10. Find the first number greater than 15.
        List<Integer> numbers3 = Arrays.asList(5, 10, 20, 30, 12);
        numbers3.stream().filter(integer -> integer>15).findFirst().get();


        int m = numbers3.stream().filter(i->i>15).findFirst().get();
        System.out.println(m);

        // Q11. From a list of names, get names with length > 3, convert to uppercase, and collect to list.
        List<String> names5 = Arrays.asList("Ram", "Anu", "Karan", "Ravi");
        List<String> collect1 = names5.stream().filter(name -> name.length() > 5).map(i -> i.toUpperCase()).collect(Collectors.toList());

        //🔹 Q12. Given a list of strings, filter out null or empty strings and print the rest.
        List<String> data = Arrays.asList("abc", "", null, "hello", "world", "");



        data.stream().filter(i->i!=null||i!="").forEach(System.out::println);

        //Q13. Sort a list of integers in descending order and print.
        List<Integer> numbers4 = Arrays.asList(10, 3, 15, 7, 8);



        List<Integer> collect2 = numbers4.stream().sorted((i1, i2) -> {
            return i2 - i1;
        }).collect(Collectors.toList());

        System.out.println(collect2);

        List<Integer> collect3 = numbers4.stream().sorted().collect(Collectors.toList());
        System.out.println(collect3);


        List<Integer> collect4 = numbers2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(collect4);


    }


    public static void print(){
        //Q4: Sort a list of names alphabetically and print
//        List<String> names = Arrays.asList("Zara", "Bob", "Alice", "Mike");
//        names.stream().sorted().forEach(System.out::println);
//
//    // Q6: Skip the first 2 elements and print the rest
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange");
//
//        fruits.stream().skip(2).forEach(System.out::println);

       // Filter even numbers, square them, and print the result

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream().filter(i->i%2==0).map(integer -> integer*integer).forEach(System.out::println);

        //Q8: Convert names to lowercase, remove duplicates, and sort alphabetically

        List<String> names = Arrays.asList("John", "ALICE", "Bob", "alice", "John");

        names.stream().map(i->i.toLowerCase()).distinct().sorted().forEach(System.out::println);


        //🧠 Q9: Sort a list of strings by length (shortest to longest)
        List<String> animals = Arrays.asList("Elephant", "Dog", "Cat", "Horse", "Lion");

        String str = "apple banana";

        Map<Character,Long>map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));








    }



    public static void moderateQuestion(){

      //  Remove duplicates from a list and print unique elements

        List<Integer> data = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> collect = data.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        //Q4: Sort a list of names alphabetically and print
        List<String> names = Arrays.asList("Zara", "Bob", "Alice", "Mike");

        List<String> collect1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

        //Q5: Limit the stream to first 3 elements and print
        List<Integer> scores = Arrays.asList(99, 85, 78, 67, 90, 55);

        //print top 3
        List<Integer> collect2 = scores.stream().limit(3).collect(Collectors.toList());

        //skip top 3
        int a = scores.stream().skip(3).findFirst().get();
        System.out.println(a);

        //get last 3 to print
        scores.stream().skip(scores.size()-3).collect(Collectors.toList());



        System.out.println(collect2);

        //🧠 Q6: Skip the first 2 elements and print the rest

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange");

        fruits.stream().skip(2).forEach(System.out::println);


        // Q7: Filter even numbers, square them, and print the result
        Transaction t = new Transaction(1,"def");
        Transaction t1 = new Transaction(2,"abc");
        Transaction t2= new Transaction(1,"def");
        Transaction t3 = new Transaction(4,"abc");
        List<Transaction> transactions = List.of(t,t1,t2,t3);
        Set<Integer> ids = new HashSet<>();
        Map<Transaction,Boolean> transactionIntegerMap=new HashMap<>();
        System.out.println(transactionIntegerMap);
        List<Transaction> collect3 = transactions.stream().filter(transaction -> {
            return transactionIntegerMap.put(transaction,true);
        }).collect(Collectors.toList());
        System.out.println(transactionIntegerMap);
        System.out.println(collect3);
    }
}

record Transaction(
        int id,
        String name
){
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
