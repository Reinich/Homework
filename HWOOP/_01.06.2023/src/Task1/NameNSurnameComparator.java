package Task1;

import java.util.Comparator;

public class NameNSurnameComparator implements Comparator<Employee> {

    public int compareSurname(Employee o1, Employee o2) {
        return o1.getSurname().substring(0,2).compareTo(o2.getSurname().substring(0,2));
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int surnameSort = compareSurname(o1, o2);
        if (surnameSort == 0){
            return o1.getName().substring(0,1).compareTo(o2.getName().substring(0, 1));
        }
        return surnameSort;
    }
}
