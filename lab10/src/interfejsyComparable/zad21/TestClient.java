package interfejsyComparable.zad21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();

        clientList.add(new Client("Smith", 5000));
        clientList.add(new Client("Johnson", 7500));
        clientList.add(new Client("Doe", 5000));
        clientList.add(new Company("XYZ Corp", 10000, 50));
        clientList.add(new Company("ABC Ltd", 8000, 50));

        System.out.println("Lista przed sortowaniem:");
        for (Client client : clientList) {
            System.out.println(client);
        }

        Collections.sort(clientList);

        System.out.println("\nLista po sortowaniu:");
        for (Client client : clientList) {
            System.out.println(client);
        }
    }
}
