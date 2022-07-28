public class CreditFeature {
    private long id;
    private Credit creditId;
    private Feature featureId;
    private String description;

    public CreditFeature(long id, Credit creditId, Feature featureId, String description) {
        this.id = id;
        this.creditId = creditId;
        this.featureId = featureId;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Credit getCreditId() {
        return creditId;
    }

    public void setCreditId(Credit creditId) {
        this.creditId = creditId;
    }

    public Feature getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Feature featureId) {
        this.featureId = featureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
