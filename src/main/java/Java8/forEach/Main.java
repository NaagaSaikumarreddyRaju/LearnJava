package Java8.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sai","reddy","kumar","padma","reddy");

        list.forEach(name -> System.out.println(name)); //list.forEach(System.out::println);   both are same

        List<Employee> Emps = Arrays.asList(new Employee(5169,"sai",600),
                                           new Employee(5149,"sundeep",310),
                                           new Employee(5217,"padma",100));

        Emps.forEach(emp -> System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+ emp.getEmpSal()));
        //emps.forEach(System.out::println); to use method reference import toString() in class


        //Set
        Set<String> colors = Set.of("yellow","red","green");
        colors.forEach(color -> System.out.println(color));

        //Map
        Map<String,Integer> wordCount = Map.of("sai",10,"padma",2,"reddy",30);
        wordCount.forEach((k,v) -> System.out.println(k+"==="+v));

        Map<Integer,Employee> empMap= Map.of(123,new Employee(5169,"sai",600),
                345,new Employee(5149,"sundeep",310));

        empMap.forEach((id,empInfo) -> System.out.println(id+"======="+empInfo.getEmpId()+" "+ empInfo.getEmpSal()+" "+empInfo.getEmpName()));

    }
}
