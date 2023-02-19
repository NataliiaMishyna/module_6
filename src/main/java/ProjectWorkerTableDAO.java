public class ProjectWorkerTableDAO {
    private String PROJECT_ID;
    private String WORKER_ID;

    public ProjectWorkerTableDAO(String PROJECT_ID, String WORKER_ID) {
        this.PROJECT_ID = PROJECT_ID;
        this.WORKER_ID = WORKER_ID;
    }

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public String getWORKER_ID() {
        return WORKER_ID;
    }
}
