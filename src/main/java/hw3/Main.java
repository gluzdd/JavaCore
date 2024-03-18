package hw3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

//        Manager masha = new Manager("Nesterova", "Masha", "+7-999-888-77-66", 1000,
//                LocalDate.of(1995, 20, 10), "director");

        Employee [] employees = {new Manager( "Masha","Nesterova", "+7-999-888-77-66", 1000,
                        LocalDate.of(1995, 8, 10), "director", 4),
                new Worker( "Anna","Kudr", "+7-239-882-37-59", 780,
                        LocalDate.of(1979, 12, 30), "worker", 2),
                new Worker( "Nina","Petrova", "+7-379-835-77-64", 850,
                        LocalDate.of(1975, 6, 5), "worker", 2),
                new Worker( "Kris", "Bazil","+7-359-638-72-83", 900,
                        LocalDate.of(1977, 1, 1), "zamdirector", 2),
                new Worker( "Javokhir", "Rakhmatov","+7-736-752-78-24", 750,
                        LocalDate.of(1988, 2, 10), "worker", 2)};


//        for (Employee employee: employees)  {
//            System.out.println(employee);
//        }
//        System.out.println();
//
//        Arrays.sort(employees);
//        for (Employee employee: employees)  {
//            System.out.println(employee);
//        }
//
//        Arrays.asList(employees).forEach(el -> System.out.println(el));
//        Manager.addSalary(employees, 20, 3000);
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

        Manager.assign(employees, "Bazil", "Подготовь доклад", 2);

        Arrays.asList(employees).forEach(System.out::println);
    }
}
