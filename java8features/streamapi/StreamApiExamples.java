package java8features.streamapi;
// Java Stream API Interview Questions with Answers
// Java Stream API Interview Questions with Answers

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiExamples {



    // 1. Convert list of strings to uppercase
    public static List<String> convertToUpper(List<String> input) {
//        return input.stream().map(String::toUpperCase).collect(Collectors.toList());
        return input.stream().map((String::toLowerCase)).collect(Collectors.toList());
    }

    // 2. Remove null values from list
    public static List<String> removeNulls(List<String> input) {
//        return input.stream().filter(Objects::nonNull).collect(Collectors.toList());
        return input.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    // 3. Find max and min
    public static int findMax(List<Integer> numbers) {
//        return numbers.stream().max(Integer::compare).orElseThrow();
        return numbers.stream().max(Integer::compareTo).orElseThrow();
    }

    public static int findMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElseThrow();
    }

    // 4. Count duplicate elements
    public static Map<String, Long> countDuplicates(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 5. Find first non-repeating character
    public static Optional<Character> firstNonRepeatedChar(String input) {
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return charCount.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // 6. Convert list of objects to map
    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
    }

    public static Map<String, Employee> mapByName(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(Employee::getName, Function.identity()));
    }

    // New: Return Map with ID as key and salary as value
    public static Map<Integer, Double> mapIdToSalary(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getSalary));
    }

    // 7. Group by department and average salary
    public static Map<String, Double> averageSalaryByDept(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    // 8. Merge two lists
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }

    // 9. Sort list of custom objects
    public static List<Employee> sortEmployeesBySalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
    }

    // 10. flatMap usage: Flatten a nested list
    public static List<Integer> flattenNestedList(List<List<Integer>> nestedList) {
        return nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    // 11. paginate a list
    public static List<Integer> paginate(List<Integer> list, int page, int size) {
        return list.stream()
                .skip((long) page * size)
                .limit(size)
                .collect(Collectors.toList());
    }

    // 12. Handle exception in stream
    public static List<Integer> safeParse(List<String> numbers) {
        return numbers.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }

    // 13. Use peek for debugging
    public static List<String> debugStream(List<String> names) {
        return names.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // 14. reduce example - sum
    public static int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    // 15. findAny vs findFirst
    public static Optional<String> findAnyName(List<String> names) {
        return names.stream().findAny();
    }

    public static Optional<String> findFirstName(List<String> names) {
        return names.stream().findFirst();
    }

    // New: Calculate frequency of each word in string
    public static Map<String, Long> wordFrequency(String text) {
        return Arrays.stream(text.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // New: Find largest and second largest number in array
    public static int[] findTwoLargest(int[] arr) {
//        return Arrays.stream(arr)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .distinct()
//                .limit(2)
//                .mapToInt(Integer::intValue)
//                .toArray();

        return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().limit(1).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        // Test and demonstrate here if needed
    }
} // End of StreamApiExamples
