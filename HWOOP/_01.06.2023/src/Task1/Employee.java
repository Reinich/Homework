package Task1;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected int age;
    protected double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getAge() {return age;}
    public double getSalary() {
        return salary;
    }


    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }

}
