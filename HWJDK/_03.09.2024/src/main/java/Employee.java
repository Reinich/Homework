public class Employee {
    private String name;
    private String phoneNumber;
    private static int counter;
    private int id;

    {
        counter++;
    }

    private int seniority;

    public Employee(String name, String phoneNumber, int seniority) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.seniority = seniority;
        setId();
    }

    // region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = counter;
    }
    // endregion

    public void printAllInfo() {
        System.out.printf("ID: %d,\tName:  %s,\tPhone: %s,\tSeniority: %d.\n", this.getId(),
                this.getName(), this.getPhoneNumber(), this.getSeniority());
    }

    @Override
    public String toString() {
        return String.format("ID: %d,\tName:  %s,\tPhone: %s,\tSeniority: %d;",id, name, phoneNumber, seniority);
    }
}
