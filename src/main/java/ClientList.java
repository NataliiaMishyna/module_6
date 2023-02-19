import java.util.ArrayList;
import java.util.List;

public class ClientList {
    public static List<ClientDAO> clientDAOS = new ArrayList<>();

    public static List<ClientDAO> getInitClientDAO() {
        clientDAOS.add(new ClientDAO("1", "Клієнт1 Карпенко Карий"));
        clientDAOS.add(new ClientDAO("2", "Клієнт2 Каленко Ліза"));
        clientDAOS.add(new ClientDAO("3", "Клієнт3 Беренко Олена"));
        clientDAOS.add(new ClientDAO("4", "Клієнт4 Швец Валентин"));
        clientDAOS.add(new ClientDAO("5", "Клієнт5 Ярий Кирил"));
        return clientDAOS;
    }
}
