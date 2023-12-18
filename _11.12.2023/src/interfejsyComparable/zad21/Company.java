package interfejsyComparable.zad21;

public class Company extends Client{
    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "lastName='" + super.getLastName() + '\'' +
                ", balance=" + super.getBalance() +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    @Override
    public int compareTo(Client obj) {
        if (obj instanceof Company) {
            Company otherCompany = (Company) obj;
            int clientComparison = super.compareTo(obj);
            if (clientComparison == 0) {
                return Integer.compare(this.numberOfEmployees, otherCompany.numberOfEmployees);
            } else {
                return clientComparison;
            }
        } else {
            return super.compareTo(obj);
        }
    }
}
