package Java8.dataSorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("devi","raju","rani","krishna","raju","rani","king","queen","ratan");

        System.out.println("Using Collections.sort()");

        Collections.sort(list); //By default ascending order

        System.out.println("Ascending order "+list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Descending order "+list);

        System.out.println("Using List.sort() Ascending");
        list.sort((x,y) -> x.compareTo(y));
        System.out.println(list);

        System.out.println("Using List.sort() Descending");
        list.sort((x,y) -> -x.compareTo(y));
        System.out.println(list);

        System.out.println("Using stream sort() Ascending");
        list.stream()
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println("Using stream sort() Descending");
        list.stream().sorted((x,y) -> -x.compareTo(y));
        System.out.println(list);


        System.out.println("Filter the data and perform stream sort()");
         list.stream()
                 .filter(x -> x.startsWith("r"))
                 .sorted()
                 .forEach(name -> System.out.println(name));

    }
}
