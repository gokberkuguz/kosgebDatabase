public class IndividualEntrepreneurs extends Entreprenurs{
    private String firstName;
    private String lastName;
    private String nationalId;


    public IndividualEntrepreneurs(long id, String phoneNumber, String email, String password, long entreprenursId, int creditScore, boolean applicable, String firstName, String lastName, String nationalId) {
        super(id, phoneNumber, email, password, entreprenursId, creditScore, applicable);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
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

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
