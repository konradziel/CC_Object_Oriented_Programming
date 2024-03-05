public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000.00);

        System.out.println("Current Balance: " + account.getBalance());
        account.deposit(237.43);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(118.23);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}

class BankAccount {
    double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
