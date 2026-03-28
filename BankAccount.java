import java.util.*;

abstract class BankAccount {

    private String accountNumber;
    private String accountHolder;
    protected double balance;
    protected ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        transactions.add("Deposited: $" + amount);
        System.out.println("Deposited: $" + amount);
    }

    public abstract void withdraw(double amount);

    public void showBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void showTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}