import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException, SQLException {

/*
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/init_db.sql")));
        database.executeUpdate(sql);
*/
        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:./myBaseModule6", null, null)
                .load();

        // Start the migration
        flyway.migrate();

//        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
//        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();
//        List<MaxSalaryWorker> maxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorker();
//        List<YoungestOldestWorkers> youngestOldestWorkers = new DatabaseQueryService().findYoungestOldestWorkers();
//        List<PrintProjectPrices> printProjectPrices = new DatabaseQueryService().printProjectPrices();
//        System.out.println("maxProjectCountClients = " + maxProjectCountClients);
//        System.out.println("longestProjects = " + longestProjects);
//        System.out.println("maxSalaryWorkers = " + maxSalaryWorkers);
//        System.out.println("youngestOldestWorkers = " + youngestOldestWorkers);
//        System.out.println("printProjectPrices = " + printProjectPrices);
    }
}
