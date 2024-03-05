package interfejsyComparable.zad21;

public class Client implements Comparable<Client>{
    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Client obj) {
        if (this.balance != obj.balance) {
            return Double.compare(obj.balance, this.balance);
        }
        return this.lastName.compareTo(obj.lastName);
    }
}
