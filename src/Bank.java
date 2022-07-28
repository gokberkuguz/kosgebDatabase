import java.util.ArrayList;
import java.util.List;

public class Bank {
    private long id;
    private String name;
    private final List<BankUser> bankUsers = new ArrayList<>();

    public Bank(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankUser> getBankUsers() {
        return bankUsers;
    }
}
