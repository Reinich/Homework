package Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int randomTypeOfEmployee = random.nextInt(0, 2);
        if (randomTypeOfEmployee == 0){
            int salary = random.nextInt(60000, 80000);
            int age = random.nextInt(20, 45);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, salary);
        }else {
            int salary = random.nextInt(1000, 2000);
            int age = random.nextInt(20, 45);
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, salary);
        }
    }

    public static void main(String[] args) {
        int capacity = 10;
        List<Employee> employees = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){employees.add(generateEmployee());}

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        employees.sort(new AgeNSalaryComparator());
        System.out.println();
        employees.sort(new NameNSurnameComparator());
        System.out.println();


        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
