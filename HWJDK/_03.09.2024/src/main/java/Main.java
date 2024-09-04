import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", "+790024", 6);
        Employee employee2 = new Employee("Vasiliy", "+795214", 1);
        Employee employee3 = new Employee("Roman", "+791254", 3);
        Employee employee4 = new Employee("Anna", "+791856", 2);
        Employee employee5 = new Employee("Pavel", "+791027", 3);

        CatalogEmployee catalogEmployee = new CatalogEmployee();
        catalogEmployee.addEmployee(employee1)
                .addEmployee(employee2)
                .addEmployee(employee3)
                .addEmployee(employee4)
                .addEmployee(employee5);

        catalogEmployee.printEmployeesInfo();

        System.out.println();

        Employee needToFindById = catalogEmployee.findEmployeeByID(2);
        needToFindById.printAllInfo();

        List<String> needsEmployeeByPhone;
        needsEmployeeByPhone = catalogEmployee.findPhoneNumberByName("Anna");
        System.out.println(needsEmployeeByPhone.toString());

        List<Employee> needsEmployeeBySeniority;
        needsEmployeeBySeniority = catalogEmployee.findEmployeeBySeniority(3);
        System.out.println(needsEmployeeBySeniority.toString());
    }
}
