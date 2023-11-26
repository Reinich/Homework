package classes;

public abstract class Employee implements Comparable<Employee> {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double salary;

    protected Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract double calculateSalary();


    // region Getters and Setters
    public String getCareer() {
        return String.format(getClass().getSimpleName());
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }


    // endregion
}
