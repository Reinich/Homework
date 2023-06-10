package Task1;

import java.util.Comparator;

public class NameNSurnameComparator implements Comparator<Employee> {

    public int compareName(Employee o1, Employee o2) {
        return o1.getName().substring(0,1).compareTo(o2.getName().substring(0, 1));
    }
    public int compareSurname(Employee o1, Employee o2) {
        return o2.getSurname().substring(0,1).compareTo(o1.getSurname().substring(0,1));
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int nameSort = compareName(o1, o2);
        int surnameSort = compareSurname(o1, o2);
        return Integer.compare(nameSort, surnameSort);
    }
}
