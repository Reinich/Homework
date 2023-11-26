package sorts;

import classes.Employee;

import java.util.Comparator;


public class NameSort implements Comparator<Employee> {

    @Override
    public int compare(Employee first, Employee second) {
        return first.getFirstName().compareTo(second.getFirstName());
    }
}


