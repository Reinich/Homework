package Task1.models;

public abstract class Worker {
    private final String name;
    private int minSalary;

    public Worker(String name, int minSalary) {
        this.name = name;
        this.minSalary = minSalary;
    }
    public String getName() {
        return name;
    }

    public int getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(int salary){
        this.minSalary = salary;
    }
}
