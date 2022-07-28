import java.util.ArrayList;
import java.util.List;

public abstract class Entreprenurs extends User{
    private long entreprenursId;
    private int creditScore;
    private boolean applicable;
    private BannedList bannedList;
    private final List<Application> applications = new ArrayList<>();

    public Entreprenurs(long id, String phoneNumber, String email, String password, long entreprenursId, int creditScore, boolean applicable) {
        super(id, phoneNumber, email, password);
        this.entreprenursId = entreprenursId;
        this.creditScore = creditScore;
        this.applicable = applicable;
    }

    public long getEntreprenursId() {
        return entreprenursId;
    }

    public void setEntreprenursId(long entreprenursId) {
        this.entreprenursId = entreprenursId;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isApplicable() {
        return applicable;
    }

    public void setApplicable(boolean applicable) {
        this.applicable = applicable;
    }

    public List<Application> getApplications() {
        return applications;
    }
}
