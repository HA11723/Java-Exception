# Bank Account Project

## Overview

This project simulates a simple **bank account system** that allows deposits and withdrawals. It handles exceptions such as invalid withdrawals (exceeding balance) and invalid deposits (negative or zero amounts). The system is built using Java and includes custom exception handling to ensure proper validation of user inputs.

### Features:
- **Deposit**: Allows users to deposit money into the account. Throws an exception if the deposit amount is negative or zero.
- **Withdraw**: Allows users to withdraw money from the account. Throws an exception if the withdrawal exceeds the available balance or if the amount is negative or zero.
- **Balance**: Displays the current balance of the account.
- **Exit**: Exits the program.

## Project Structure

The project is structured as follows:


## Classes

### `BankAccount.java`
- Handles the balance, deposit, and withdrawal operations.
- Throws exceptions for invalid operations (negative deposits/withdrawals or withdrawal exceeding the balance).

### `IllegalAmountException.java`
- Custom exception thrown when a withdrawal exceeds the available balance.

### `IllegalDepositAmountException.java`
- Custom exception thrown when a deposit is zero or negative.

### `IllegalWithdrawAmountException.java`
- Custom exception thrown when a withdrawal is zero or negative.

### `TestBankAccount.java`
- The main driver program that allows the user to interact with the bank account, deposit, withdraw, and view the balance. It handles exceptions and displays error messages to the user.

## Running the Program

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/A11723/BankAccountProject.git

javac *.java

java TestBankAccount

Example Interaction:
1. show balance
2. withdraw
3. deposit
4. exit
Choose Your Option: 3
amount to deposit: 500
balance after deposit: 1500.0

1. show balance
2. withdraw
3. deposit
4. exit
Choose Your Option: 2
amount to withdraw: 2000
Error: withdraw exceeds your balance.




