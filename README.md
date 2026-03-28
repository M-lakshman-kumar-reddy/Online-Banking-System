# Online Banking System

A console-based Java banking application that supports basic account management operations such as account creation, deposit, withdrawal, balance inquiry, customer listing, and transaction history.

## Features

- Create new customer accounts
- Support for two account types:
	- Savings Account (minimum balance rule)
	- Current Account (overdraft limit)
- Deposit money
- Withdraw money
- Show balance for a specific account
- Show all customers
- View transaction history
- Basic input validation for menu choices and transaction amounts

## Tech Stack

- Language: Java
- Runtime: JDK 22 (works with recent JDK versions)
- Interface: Console (CLI)

## Project Structure

- BankSystem.java: Main menu and program flow
- BankAccount.java: Abstract base class for accounts
- SavingsAccount.java: Savings account rules
- CurrentAccount.java: Current account rules
- Customer.java: Customer details and account mapping

## How to Run

1. Open terminal in the project folder.
2. Compile all Java files:

```bash
javac *.java
```

3. Run the application:

```bash
java BankSystem
```

## Menu Options

1. Create Account
2. Deposit
3. Withdraw
4. Show Balance
5. Show All Customers
6. Transaction History
7. Exit

## Example Flow

1. Create a savings or current account.
2. Deposit money to the account.
3. Withdraw money according to account rules.
4. Check balance and transaction history.

## Validation Rules

- Menu input must be numeric.
- Initial balance cannot be negative.
- Deposit amount must be greater than zero.
- Withdrawal amount must be greater than zero.
- Savings account must maintain minimum balance.
- Current account cannot exceed overdraft limit.

## Future Improvements

- Persist data to file or database
- Add login and authentication
- Add interest calculation for savings accounts
- Add unit tests
- Build GUI or web interface

## Author

Lakshman