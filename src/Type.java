import java.util.ArrayList;
import java.util.List;

public class Type {
    private long id;
    private String name;
    private int parentId;
    private final List<Employee> employees = new ArrayList<>();

    public Type(long id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
