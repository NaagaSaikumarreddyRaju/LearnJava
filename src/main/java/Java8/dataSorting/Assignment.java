package Java8.dataSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
          List<Integer> marks = Arrays.asList(5,4,3,7,8,23,34,45,67);

        System.out.println("****Collections.sort()****");
        System.out.println("****ASCENDING ORDER****");
        Collections.sort(marks);
        System.out.println(marks);

        System.out.println("****DESCENDING ORDER****");
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

        System.out.println("****list.sort()****");
        System.out.println("****ASCENDING ORDER****");
        marks.sort((x,y) -> x.compareTo(y));
        System.out.println(marks);

        System.out.println("****DESCENDING ORDER****");
        marks.sort((x,y) -> -x.compareTo(y));
        System.out.println(marks);

        System.out.println("****Stream sort()****");
        System.out.println("****ASCENDING ORDER****");
        marks.stream()
                .sorted();
        System.out.println(marks);

        System.out.println("****DESCENDING ORDER****");
        marks.stream()
                .sorted((x,y) -> -x.compareTo(y));
        System.out.println(marks);


        System.out.println("****Stream sort() and filter the data and multiply by 10****");
        System.out.println("****DESCENDING ORDER****");
        marks.stream()
                .filter(x -> x<10)
                .map(y -> y*10)
                .sorted((mark1,mark2)-> -mark1.compareTo(mark2))
                .collect(Collectors.toList());
        System.out.println(marks);

    }
}
