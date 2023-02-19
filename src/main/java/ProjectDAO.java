import java.util.Date;

public class ProjectDAO {
    private String id;
    private String client_id;
    private Date start_date;
    private Date finish_date;

    public ProjectDAO(String id, String client_id, Date start_date, Date finish_date) {
        this.id = id;
        this.client_id = client_id;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    public String getId() {
        return id;
    }

    public String getClient_id() {
        return client_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }
}
