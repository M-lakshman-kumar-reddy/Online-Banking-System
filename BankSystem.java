import java.util.*;

public class BankSystem {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Customer> customers = new ArrayList<>();

            while (true) {

                System.out.println("\n=== Banking System ===");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Show Balance");
                System.out.println("5. Show All Customers");
                System.out.println("6. Transaction History");
                System.out.println("7. Exit");

                int choice;
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a number from 1 to 7.");
                    sc.nextLine();
                    continue;
                }
                sc.nextLine();

                switch (choice) {

                case 1:
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    if (balance < 0) {
                        System.out.println("Invalid balance!");
                        break;
                    }

                    BankAccount account;

                    if (type == 1) {
                        account = new SavingsAccount(accNo, name, balance);
                    } else if (type == 2) {
                        account = new CurrentAccount(accNo, name, balance);
                    } else {
                        System.out.println("Invalid account type!");
                        break;
                    }

                    customers.add(new Customer(name, account));
                    System.out.println("Account created successfully!");
                    break;

                    case 2:
                        System.out.print("Enter Account Number: ");
                        String accDep = sc.nextLine();

                        for (Customer c : customers) {
                            if (c.getAccount().getAccountNumber().equals(accDep)) {
                                System.out.print("Enter amount: ");
                                c.getAccount().deposit(sc.nextDouble());
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account Number: ");
                        String accWd = sc.nextLine();

                        for (Customer c : customers) {
                            if (c.getAccount().getAccountNumber().equals(accWd)) {
                                System.out.print("Enter amount: ");
                                c.getAccount().withdraw(sc.nextDouble());
                            }
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account Number: ");
                        String accBal = sc.nextLine();

                        for (Customer c : customers) {
                            if (c.getAccount().getAccountNumber().equals(accBal)) {
                                c.displayDetails();
                            }
                        }
                        break;

                    case 5:
                        for (Customer c : customers) {
                            c.displayDetails();
                            System.out.println("------------------");
                        }
                        break;

                    case 6:
                        System.out.print("Enter Account Number: ");
                        String accTr = sc.nextLine();

                        for (Customer c : customers) {
                            if (c.getAccount().getAccountNumber().equals(accTr)) {
                                c.getAccount().showTransactions();
                            }
                        }
                        break;

                    case 7:
                        System.out.println("Thank you!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        }
    }
}