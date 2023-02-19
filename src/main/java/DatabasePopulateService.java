import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException, IOException {
            insertWorkerTable();
            insertClientTable();
            insertProjectTable();
            insertProjectWorkerTable();
     }

    public static void insertWorkerTable() throws IOException, SQLException{
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db.sql")));
         try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            List<WorkerDAO> workerDAOS = WorkerList.getInitWorkerDAO();
            for (WorkerDAO worker:workerDAOS) {
                preparedStatement.setString(1, worker.getID());
                preparedStatement.setString(2, worker.getName());
                preparedStatement.setDate(3, (Date) worker.getBirthday());
                preparedStatement.setString(4, worker.getLevel());
                preparedStatement.setInt(5, worker.getSalary());
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertClientTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_client.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            List<ClientDAO> clientDAOS = ClientList.getInitClientDAO();
            for (ClientDAO client:clientDAOS) {
                preparedStatement.setString(1, client.getID());
                preparedStatement.setString(2, client.getName());
                preparedStatement.executeUpdate();
            }

            preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertProjectTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_project.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            List<ProjectDAO> projectDAOS = ProjectList.getInitProjectDAO();
            for (ProjectDAO project:projectDAOS) {
                preparedStatement.setString(1, project.getId());
                preparedStatement.setString(2, project.getClient_id());
                preparedStatement.setDate(3, (Date) project.getStart_date());
                preparedStatement.setDate(4, (Date) project.getFinish_date());
                preparedStatement.executeUpdate();
            }

            //preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertProjectWorkerTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_project_worker.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            List<ProjectWorkerTableDAO> projectWorkerTableDAOS = ProjectWorkerTableList.getInitProjectWorkerTableDAO();
            for (ProjectWorkerTableDAO projectWorkerTable:projectWorkerTableDAOS) {
                preparedStatement.setString(1, projectWorkerTable.getPROJECT_ID());
                preparedStatement.setString(2, projectWorkerTable.getWORKER_ID());
                preparedStatement.executeUpdate();
            }

            //preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

}
