package Task1;

import java.util.Random;

// 20 * 8
public class Freelancer extends Employee{


    private Random random = new Random();

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary*random.nextInt(10,20)*random.nextInt(5, 8);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d лет; Фрилансер; Почасовая оплата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }

}
