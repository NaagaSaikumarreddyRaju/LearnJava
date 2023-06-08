package Java8.Filter.ObjectData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> Emp = Arrays.asList(new Employee(1,"sai",10000.45),
                new Employee(2,"reddy",20000.45),
                new Employee(3,"sundeep",30000),
                new Employee(4,"padma",40000));

        System.out.println("****Filter the emp data and print the data");

        Emp.stream().filter(emp -> emp.eName.startsWith("s")).forEach(emp -> System.out.println(emp.eId+"  "+emp.eName+"  "+emp.eSal));

        System.out.println("****Filter the emp data and collect the data in List format");

         Emp.stream()
                .filter(emp -> emp.eSal>15000)
                .collect(Collectors.toList())
                .forEach(emp -> System.out.println(emp.eName+"  "+emp.eSal));


        System.out.println("****Filter the emp data and collect the data in Set format");

        Emp.stream()
                .filter(emp -> emp.eSal>25000)
                .collect(Collectors.toSet())
                .forEach(emp -> System.out.println(emp.eName+"  "+emp.eSal));


        System.out.println("****Filter the emp data findFirst Element");


        Employee em = Emp.stream()
                         .filter(emp -> emp.eSal>15000)
                         .findFirst().get();
        System.out.println(em.eId+" "+em.eName+" "+em.eSal);

        System.out.println("****Filter the emp data get the first or return null");

        Employee emp1 = Emp.stream()
                .filter(emp -> emp.eSal>150000)
                .findFirst().orElse(null); // here we don't have data we have null pointer exception : use orElse() instead of get()
        if (emp1 == null) {
            System.out.println(emp1);
        } else {
            System.out.println(emp1.eId+" "+emp1.eName+" "+emp1.eSal);
        }


        System.out.println("****Filter the emp data get the specific element");


     }
}
