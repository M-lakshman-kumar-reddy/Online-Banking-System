class CurrentAccount extends BankAccount {

    private double overdraftLimit = 5000;

    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            transactions.add("Withdrawn: $" + amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded! (Limit: $" + overdraftLimit + ")");
        }
    }
}