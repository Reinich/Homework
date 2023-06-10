package Task1;

// 20 * 8
public class Freelancer extends Employee{


    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер; %s %s %d лет; Почасовая оплата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }

}
