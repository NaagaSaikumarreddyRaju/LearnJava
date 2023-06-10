package Java8.dataSorting;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(56,"Sai",10000.45),
                new Employee(23,"Subba",20000.45),
                new Employee(11,"Sundeep",30000),
                new Employee(18,"Padma",40000));

//        System.out.println("Using Collections.sort() on Name ASC");
//
//        employeeList.sort((e1,e2) -> e1.empId.compareTo(e2.empId));
//        employeeList.forEach(emp -> System.out.println(emp));
//
//        System.out.println("Using Collections.sort() on Name DESC");
//        employeeList.sort((e1,e2) -> -e1.empId.compareTo(e2.empId));
//        employeeList.forEach(emp -> System.out.println(emp));

        System.out.println("Using Stream sorted() on Name ASC");
        employeeList.stream()
                .filter(emp -> emp.empSal > 20000)
                .sorted((e1,e2)-> e1.empSal.compareTo(e2.empSal)) // Comparator.comparing(e -> e.esal)
                .forEach(emp -> System.out.println(emp));


    }
}
