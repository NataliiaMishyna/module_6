import java.sql.SQLException;
import java.util.List;

public class AppClientService {
    public static void main(String[] args) throws SQLException {
        Database database = Database.getInstance();
        ClientService clientService = new ClientService(database);
        ClientDAO clientNatalia = new ClientDAO("10", "Natalia");

        clientService.create(clientNatalia);
        System.out.println(clientService.getById("6"));

        ClientDAO clientMisha = new ClientDAO("6", "Misha");
        clientService.setName(clientMisha);
        System.out.println(clientService.getById("6"));

        clientService.deleteById("6");
        List<ClientDAO> clientDAOList = clientService.listAll();
        for (ClientDAO client:clientDAOList) {
            System.out.println("client = " + client);
        }

        clientService.deleteAll();
        List<ClientDAO> clientDAOLists = clientService.listAll();
        if(clientDAOLists.isEmpty()){
            System.out.println("Список клієнтів пустий");
        }
    }
}
