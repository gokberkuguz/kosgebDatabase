public class Employee extends User{
    private String firstName;
    private String lastName;
    private String branch;
    private Type typeId;

    public Employee(long id, String phoneNumber, String email, String password, String firstName, String lastName, String branch, Type typeId) {
        super(id, phoneNumber, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.typeId = typeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }
}
