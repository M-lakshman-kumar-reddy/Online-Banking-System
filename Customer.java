class Customer {

    private static int counter = 1;
    private int customerId;
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
        this.customerId = counter++;
    }

    public void displayDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + account.getAccountNumber());
        account.showBalance();
    }

    public BankAccount getAccount() {
        return account;
    }
}