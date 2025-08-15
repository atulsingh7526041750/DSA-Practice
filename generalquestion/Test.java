package generalquestion;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
     String name;
     String department;
     double salary;

     Employee(String name, String department, double salary) {
         this.name = name;
         this.department = department;
         this.salary = salary;
     }
}
public class Test{

    public static void main(String[] args) {
        Employee employee1 = new Employee("Atul","IT",123);
        Employee employee2 = new Employee("Atul","CSE",321);
        Employee employee3 = new Employee("Atul","MEC",4223);
        Employee employee4 = new Employee("Atul","CSE",4212);
        Employee employee5 = new Employee("Atul","IT",434);
        Employee employee6 = new Employee("Atul","ECE",435);



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);


        //1. Count employees in each department

        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department, Collectors.counting()));

        System.out.println(collect);

        //3. 2nd highest salary in the company (already shown earlier)

        Optional<Double> first = employeeList.stream().map(employee -> employee.salary).sorted(Comparator.reverseOrder()).skip(1).findFirst();

        employeeList.stream().map(employee -> employee.salary).sorted(Comparator.reverseOrder()).findFirst();

        //2. Highest salary in the company

        employeeList.stream().max(Comparator.comparing(employee -> employee.salary)).orElseThrow();


        //4. Average salary in each department
        employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department,Collectors.averagingDouble(e->e.salary)));


        //Highest salary in each department
        employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department,Collectors.maxBy(Comparator.comparing(employee -> employee.salary))));




    }



}
