package classes;

public class Freelancer extends Employee {

    public Freelancer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.salary = calculateSalary();
    }


    /**
     * Подсчет фиксированной зарплаты
     *
     * @return
     */
    @Override
    public double calculateSalary() {
        if (age < 35) {
            this.salary = 20.8 * 8 * 200;
        } else if (age > 35 && age < 45) {
            this.salary = 20.8 * 8 * 350;
        } else {
            this.salary = 20.8 * 8 * 550;
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
