import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credit {
    private long id;
    private String name;
    private LocalDate startedDate;
    private LocalDate dueDate;
    private CreditType creditTypeId;
    private final List<CreditFeature> creditFeatures = new ArrayList<>();
    private final List<Application> applications = new ArrayList<>();

    public Credit(long id, String name, LocalDate startedDate, LocalDate dueDate, CreditType creditTypeId) {
        this.id = id;
        this.name = name;
        this.startedDate = startedDate;
        this.dueDate = dueDate;
        this.creditTypeId = creditTypeId;
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

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public CreditType getCreditTypeId() {
        return creditTypeId;
    }

    public void setCreditTypeId(CreditType creditTypeId) {
        this.creditTypeId = creditTypeId;
    }

    public List<CreditFeature> getCreditFeatures() {
        return creditFeatures;
    }

    public List<Application> getApplications() {
        return applications;
    }
}
