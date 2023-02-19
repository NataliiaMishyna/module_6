import java.util.ArrayList;
import java.util.List;

public class ProjectWorkerTableList {
    public static List<ProjectWorkerTableDAO> projectWorkerTableDAOS = new ArrayList<>();

    public static List<ProjectWorkerTableDAO> getInitProjectWorkerTableDAO() {
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("1", "3"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("2", "2"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("3", "1"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("3", "3"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("3", "4"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("3", "10"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("4", "5"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("5", "7"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("6", "8"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("7", "6"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("8", "5"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("9", "1"));
        projectWorkerTableDAOS.add(new ProjectWorkerTableDAO("10", "2"));
        return projectWorkerTableDAOS;
    }
}