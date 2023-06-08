package Java8.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
        List<String> list = List.of("devi","raju","rani","krishna","raju","rani","king","queen","ratan");

        System.out.println("****Filter the names start with k and print the data");

        list.stream()
                .filter(i -> i.startsWith("k"))
                .forEach(n -> System.out.println(n));

        System.out.println("****Filter the names start with r & length==4 and take as list format");

        list.stream()
                .filter(i -> i.startsWith("r") && i.length() ==4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("****Filter the names start with r & length==4 and take as set format");

        list.stream()
                .filter(i -> i.startsWith("r") && i.length() == 4)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("****Filter the names start with r & count the data");

        long val = list.stream()
                .filter(i -> i.startsWith("r"))
                .count();
        System.out.println("count= "+val);

        System.out.println("****Filter the names start with d & count the data");

        String first = list.stream()
                .filter(i -> i.startsWith("d"))
                .findFirst()
                .get();
        System.out.println("First Element with d: "+first);

        System.out.println("****Filter the names start with r & print the 3rd element");

        String str = list.stream()
                .filter(i -> i.startsWith("r"))
                .skip(2)
                .findFirst()
                .get();
        System.out.println("3rd element: "+str);

    }

}
