import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    private static final Database INSTANCE = new Database();
    public static Connection connection;
    private Database(){
        try{
            String url = "jdbc:h2:./myBaseModule6";
            connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static Database getInstance(){

        return INSTANCE;
    }
    public static Connection getConnection(){
        return connection;
    }

    public int executeUpdate(String sql) {
        try (Statement st = connection.createStatement()) {
            return st.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }
}


