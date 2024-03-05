package interfejsyComparable.zad12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {
        Order order1 = new Order("ProductA", 5, 10.0);
        Order order2 = new Order("ProductB", 3, 12.0);
        Order order3 = new Order("ProductC", 7, 12.0);
        Order order4 = new Order("ProductD", 7, 8.0);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);

        System.out.println("Lista przed sortowaniem:");
        for (Order order : orderList) {
            System.out.println(order);
        }

        Collections.sort(orderList);

        System.out.println("\nLista po sortowaniu:");
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
