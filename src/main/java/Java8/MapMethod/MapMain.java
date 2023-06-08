package Java8.MapMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(10,15,20,30,40,50);

        marks.stream()
                .map(i -> i*2)
                .forEach(System.out::println);

        List<String> names = List.of("sai","durga","harsha","reddy","sundeep");
        names.stream()
                .map(name -> name+"soft")
                .forEach(System.out::println);

        // Filter the even numbers & every element *10

        List<Integer> evenMarks = marks.stream()
                .filter(mark -> mark%2 == 0)
                .map(data -> data*10)
                .toList();
        System.out.println(evenMarks);

    }
}
