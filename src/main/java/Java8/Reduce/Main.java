package Java8.Reduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> marks = List.of(10,20,30,40,50,60);
        int a = marks.stream()
                .reduce((x, y) -> x+y)
                .get();
        System.out.println(a);

        List<String> list = List.of("devi","raju","rani","krishna","raju","rani","king","queen","ratan");

        String str = list.stream()
                .filter(name -> name.startsWith("r"))
                .map(name -> name+" it ")
                .reduce((x,y) -> x+y)
                .get();
        System.out.printf(str);
    }
}
