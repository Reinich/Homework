package iterator;

import classes.Employee;

import java.util.Iterator;
import java.util.List;

public class WatchEmployee implements Iterable<Employee> {
    private final List<Employee> employees;

    public WatchEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new tmp();
    }

    private class tmp implements Iterator<Employee> {
        int index;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Employee next() {
            return employees.get(index++);
        }
    }
}
