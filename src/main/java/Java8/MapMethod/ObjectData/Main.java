package Java8.MapMethod.ObjectData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> Emp = Arrays.asList(new Employee(1,"Sai",10000.45),
                new Employee(2,"Subba",20000.45),
                new Employee(3,"Sundeep",30000),
                new Employee(4,"Padma",40000));

        Emp.stream()
                .map(emp -> emp.geteName()+" Reddy")
                .forEach(System.out::println);

        Emp.stream()
                .filter(emp -> emp.geteSal() > 15000)
                .map(emp -> {
                    emp.seteSal(emp.geteSal()+1000); //map will return only the performed operation data
                    return emp; // to get full employee object
                }).forEach(System.out::println);

     }
}
