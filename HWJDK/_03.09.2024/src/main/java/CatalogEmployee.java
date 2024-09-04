import java.util.ArrayList;
import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников -
 * <p>
 * <p>
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 */
public class CatalogEmployee {

    private List<Employee> employeeList = new ArrayList<>();

    public CatalogEmployee() {
    }

    public CatalogEmployee addEmployee(Employee employee) {
        this.employeeList.add(employee);
        return this;
    }

    public List<Employee> findEmployeeBySeniority(int seniority) {
        List<Employee> employeesWithSeniority = new ArrayList<>();

        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee.getSeniority() == seniority) {
                    employeesWithSeniority.add(employee);
                }
            }
        } else {
            System.out.println("Catalog is empty");
        }
        if (employeesWithSeniority.isEmpty()) {
            throw new NoDataAvailableException("No employee with seniority ", seniority);
        }

        return employeesWithSeniority;
    }

    public List<String> findPhoneNumberByName(String name) {
        List<String> employeesPhoneNumber = new ArrayList<>();

        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    employeesPhoneNumber.add(employee.getPhoneNumber());
                }
            }
        } else {
            System.out.println("Catalog is empty");
        }
        if (employeesPhoneNumber.isEmpty()) {
            throw new NoDataAvailableException("No employee with name ", name);
        }

        return employeesPhoneNumber;
    }

    public Employee findEmployeeByID(int id) {
        if (!employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    return employee;
                }
            }
        } else {
            System.out.println("Catalog is empty");
        }
        throw new NoDataAvailableException("No employee with ID ", id);
    }

    public void printEmployeesInfo() {
        for (Employee employee : employeeList) {
            System.out.printf("ID: %d,\tName:  %s,\tPhone: %s,\tSeniority: %d.\n", employee.getId(), employee.getName(),
                    employee.getPhoneNumber(), employee.getSeniority());
        }
    }
}
