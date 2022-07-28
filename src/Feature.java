import java.util.ArrayList;
import java.util.List;

public class Feature {
    private long id;
    private String name;
    private final List<CreditFeature> creditFeatures = new ArrayList<>();

    public Feature(long id, String name) {
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

    public List<CreditFeature> getCreditFeatures() {
        return creditFeatures;
    }
}
