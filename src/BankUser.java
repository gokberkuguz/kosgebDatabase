public class BankUser {
    private long id;
    private User userID;
    private Bank bankID;

    public BankUser(long id, User userID, Bank bankID) {
        this.id = id;
        this.userID = userID;
        this.bankID = bankID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Bank getBankID() {
        return bankID;
    }

    public void setBankID(Bank bankID) {
        this.bankID = bankID;
    }
}
