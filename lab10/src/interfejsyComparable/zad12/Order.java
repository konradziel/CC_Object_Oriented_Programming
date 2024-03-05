package interfejsyComparable.zad12;

import java.util.Objects;

public class Order implements Comparable<Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }


    @Override
    public int compareTo(Order obj) {
        if(Objects.equals(obj.unitPrice, this.unitPrice)){
            return Integer.compare(this.quantity, obj.quantity);
        }
        return Double.compare(obj.unitPrice, this.unitPrice);
    }

}
