package classes;

public class Worker extends Employee {

    public Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.salary = calculateSalary();
    }


    /**
     * Подсчет фиксированной зарплаты
     *
     * @return
     */
    public double calculateSalary() {
        if (age < 35) {
            this.salary = 35000;
        } else if (age > 35 && age < 45) {
            this.salary = 55000;
        } else {
            this.salary = 75000;
        }
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d, %s, salary: %.2f\n", lastName, firstName, getAge(), getCareer(), getSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return this.getLastName().compareTo(o.getLastName());
    }

}
