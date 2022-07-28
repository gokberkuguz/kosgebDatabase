import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private long id;
    private String phoneNumber;
    private String email;
    private String password;
    private final List<UserRole> userRoles = new ArrayList<>();
    private final List<BankUser> bankUsers = new ArrayList<>();

    public User(long id, String phoneNumber, String email, String password) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public List<BankUser> getBankUsers() {
        return bankUsers;
    }
}
