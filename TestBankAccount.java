import java.util.Scanner;
public class TestBankAccount{
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		Scanner in = new Scanner(System.in);
		int option;
		double amount;
		boolean flag = true;
		System.out.println();
		do {
			System.out.print("\n1. show balance\n2. withdraw\n3. deposit\n4. exit\nChoose Your Option: ");
			try {
				option = in.nextInt(); // User input
				switch (option) {
					case 1:
						System.out.println("balance: " + account.getBalance());
						break;
					case 2:
						System.out.print("amount to withdraw: ");
						amount = in.nextDouble();
						account.withdraw(amount); // Potential exception
						System.out.println("balance after withdraw: " + account.getBalance());
						break;
					case 3:
						System.out.print("amount to deposit: ");
						amount = in.nextDouble();
						account.deposit(amount); // Potential exception
						System.out.println("balance after deposit: " + account.getBalance());
						break;
					case 4:
						System.out.println("Thanks for your business");
						flag = false;
						break;
					default:
						System.out.println("Invalid Option");
						break;
				}
			} catch (IllegalAmountException e) {
				System.out.println(e.getMessage()); // Catch and print the error message for withdraw exceptions
			} catch (IllegalDepositAmountException e) {
				System.out.println(e.getMessage()); // Catch and print the error message for deposit exceptions
			} catch (IllegalWithdrawAmountException e) {
				System.out.println(e.getMessage()); // Catch and print the error message for negative withdraw exceptions
			}
		} while (flag); // Repeat until the user selects option 4 (exit)
	}

	}