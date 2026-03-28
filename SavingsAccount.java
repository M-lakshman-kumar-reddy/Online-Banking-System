class SavingsAccount extends BankAccount {

    private double minimumBalance = 1000;

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (balance - amount >= minimumBalance) {
            balance -= amount;
            transactions.add("Withdrawn: $" + amount);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Minimum balance must be maintained! (Minimum: $" + minimumBalance + ")");
        }
    }
}