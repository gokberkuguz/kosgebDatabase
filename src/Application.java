import java.time.LocalDate;

public class Application {
    private long id;
    private String state;
    private LocalDate applicationDate;
    private Entreprenurs entreprenursId;
    private Credit creditId;
    private ApplicationPriority applicationPriority1;

    public Application(long id, String state, LocalDate applicationDate, Entreprenurs entreprenursId, Credit creditId, ApplicationPriority applicationPriority1) {
        this.id = id;
        this.state = state;
        this.applicationDate = applicationDate;
        this.entreprenursId = entreprenursId;
        this.creditId = creditId;
        this.applicationPriority1 = applicationPriority1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Entreprenurs getEntreprenursId() {
        return entreprenursId;
    }

    public void setEntreprenursId(Entreprenurs entreprenursId) {
        this.entreprenursId = entreprenursId;
    }

    public Credit getCreditId() {
        return creditId;
    }

    public void setCreditId(Credit creditId) {
        this.creditId = creditId;
    }

    public ApplicationPriority getApplicationPriority1() {
        return applicationPriority1;
    }

    public void setApplicationPriority1(ApplicationPriority applicationPriority1) {
        this.applicationPriority1 = applicationPriority1;
    }
}
