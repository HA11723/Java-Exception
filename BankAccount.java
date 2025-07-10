/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount {
    private double balance;
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount() {
    // this.balance = 0;
     this(0);

   }

   /**
      Constructs a bank account with a given balance.
   */
   public BankAccount(double balance) {
      this.balance = balance;
   }

   /**
      Deposits money into the bank account.
      @param amount to deposit
   */
   public void deposit(double amount) {
      if(amount <= 0) {
         throw new IllegalDepositAmountException("Error: deposit amount must be positive.");
      }
		balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount  to withdraw
   */
   public void withdraw(double amount) {
      if(amount <= 0) {
         throw new IllegalWithdrawAmountException("Error: withdrawal amount must be positive");
      }
      if (amount > balance) {
         throw new IllegalAmountException("Error: withdraw exceeds your balance.");
      }
	   balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }


}

