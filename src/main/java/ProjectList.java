import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ProjectList {
    public static List<ProjectDAO> projectDAOS = new ArrayList<>();

    public static List<ProjectDAO> getInitProjectDAO() {
        projectDAOS.add(new ProjectDAO("1", "3", Date.valueOf("2021-12-01"), Date.valueOf("2023-06-01")));
        projectDAOS.add(new ProjectDAO("2", "2", Date.valueOf("2019-11-01"), Date.valueOf("2024-05-01")));
        projectDAOS.add(new ProjectDAO("3", "1", Date.valueOf("2019-11-01"), Date.valueOf("2025-05-01")));
        projectDAOS.add(new ProjectDAO("4", "5", Date.valueOf("2020-10-01"), Date.valueOf("2025-08-01")));
        projectDAOS.add(new ProjectDAO("5", "4", Date.valueOf("2021-01-01"), Date.valueOf("2023-06-01")));
        projectDAOS.add(new ProjectDAO("6", "4", Date.valueOf("2021-02-01"), Date.valueOf("2029-04-28")));
        projectDAOS.add(new ProjectDAO("7", "4", Date.valueOf("2019-12-01"), Date.valueOf("2028-05-01")));
        projectDAOS.add(new ProjectDAO("8", "5", Date.valueOf("2021-12-01"), Date.valueOf("2025-07-30")));
        projectDAOS.add(new ProjectDAO("9", "1", Date.valueOf("2022-12-01"), Date.valueOf("2024-08-10")));
        projectDAOS.add(new ProjectDAO("10", "1", Date.valueOf("2023-01-01"), Date.valueOf("2026-06-30")));
        return projectDAOS;
    }
}
