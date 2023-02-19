import java.util.Date;

public class WorkerDAO {
    private String ID;
    private String name;
    private Date birthday;
    private String level;
    private int salary;
    public WorkerDAO(String ID, String name, Date birthday, String level, int salary) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getLevel() {
        return level;
    }

    public int getSalary() {
        return salary;
    }
}
