package Task;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String sex;

    public Person(String[] arr) {
        this.surname = arr[0];
        this.name = arr[1];
        this.patronymic = arr[2];
        this.birthday = arr[3];
        this.phoneNumber = arr[4];
        this.sex = arr[5];
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + birthday + " " +
                phoneNumber + " " + sex + "\n";
    }

    public String getSurname() {
        return surname;
    }
}
