public class BannedList {
    private long id;
    private Entreprenurs entreprenursId;

    public BannedList(long id, Entreprenurs entreprenursId) {
        this.id = id;
        this.entreprenursId = entreprenursId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Entreprenurs getEntreprenursId() {
        return entreprenursId;
    }

    public void setEntreprenursId(Entreprenurs entreprenursId) {
        this.entreprenursId = entreprenursId;
    }
}
