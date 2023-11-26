package main;

import classes.Employee;
import classes.Freelancer;
import classes.Worker;
import iterator.WatchEmployee;
import sorts.AgeSalarySort;
import sorts.NameSort;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int capacity = 10;

        for (int i = 0; i < capacity; i++) {
            generateEmployee(employees);
        }

        WatchEmployee tmp = new WatchEmployee(employees);


        Iterator<Employee> it = tmp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();


        employees.sort(new AgeSalarySort());                            // сортировка по возрасту и зарплате
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        System.out.println();

        employees.sort(new NameSort());                                 // сортировка только по имени
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        System.out.println();

        Collections.sort(employees);                                    // сортировка по умолчанию - по фамилии и имени
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

    }

    /**
     * Генерация работников
     *
     * @param employees пустой лист работников
     * @return возвращает заполненный лист работников
     */
    static void generateEmployee(List<Employee> employees) {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int randomTypeOfEmployee = random.nextInt(0, 2);

        if (randomTypeOfEmployee == 0) {
            int age = random.nextInt(20, 51);
            employees.add(new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age));
        } else {
            int age = random.nextInt(20, 51);
            employees.add(new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age));
        }
    }

    static final Random random = new Random();
    static List<Employee> employees = new ArrayList<>();

    static void printList() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
