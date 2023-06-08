package Java8.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,7,1,5,5,6,8);

        System.out.println("*****Filter the even data:: printing");
        numbers.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("*****Filter the odd data:: Collect the data in List Format");

        List<Integer> odd = numbers.stream()
                            .filter(i -> i%2!=0)
                            .collect(Collectors.toList());
        System.out.println(odd);

        System.out.println("*****Filter the odd data:: Collect the data without Duplicates");

        Set<Integer> dup = numbers.stream()
                .filter(i -> i%2!=0)
                .collect(Collectors.toSet());
        System.out.println(dup);

        System.out.println("*****Filter the even data:: count no of elements");

       long count = numbers.stream()
                .filter(i -> i%2==0)
                .count();
        System.out.println(count);

        System.out.println("*****Filter the even data:: find the 1st element");

        int num = numbers.stream()
                .filter(i-> i%2 ==0)
                .findFirst()
                .get();
        System.out.println(num);

        System.out.println("*****Filter the even data:: find the specific element");
        int num1 = numbers.stream()
                .filter(i -> i%2==0)
                .skip(2) // i want 3rd element so skip first 2 elements and then apply findFirst()
                .findFirst()
                .get();
        System.out.println(num1);
    }
}
