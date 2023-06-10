package Task1;

public class Worker extends Employee {

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий; %s %s %d; Фиксированная месячная оплата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
