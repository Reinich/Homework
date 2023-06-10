package Task1;

import java.util.Comparator;

public class AgeNSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        double age = Double.compare(o1.getAge(), o2.getAge()) ;
        double salary = Double.compare(o2.calculateSalary(), o1.calculateSalary());
        return Double.compare(age, salary);
    }
}
