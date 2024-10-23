package Task3;

public class Runner {

	public static void main(String[] args) {
		Bank bank = new Bank();

        // Create test accounts
        Account acc1 = new Account(1001);
        SavingAccount acc2 = new SavingAccount(1002, 5.0); // 5% interest rate
        CheckingAccount acc3 = new CheckingAccount(1003);

        // Open accounts
        bank.openAccount(acc1);
        bank.openAccount(acc2);
        bank.openAccount(acc3);

        // Perform transactions on Account acc1
        acc1.deposit(500);
        acc1.withdraw(100);
        System.out.println("Account #" + acc1.getAccNumber() + " Balance: $" + acc1.getBalance());

        // Perform transactions on SavingsAccount acc2
        acc2.deposit(1000);
        acc2.withdraw(200);
        System.out.println("Account #" + acc2.getAccNumber() + " Balance: $" + acc2.getBalance());

        // Perform transactions on CheckingAccount acc3
        acc3.deposit(1500);
        acc3.withdraw(300);
        acc3.deposit(200);
        acc3.withdraw(100);
        acc3.deposit(50); // This should trigger fees after update
        System.out.println("Account #" + acc3.getAccNumber() + " Balance: $" + acc3.getBalance());

        // Demonstrate transfer method
        System.out.println("\nTransferring $50 from Account #1001 to Account #1002...");
        acc1.transfer(50, acc2);
        System.out.println("Account #" + acc1.getAccNumber() + " Balance after transfer: $" + acc1.getBalance());
        System.out.println("Account #" + acc2.getAccNumber() + " Balance after transfer: $" + acc2.getBalance());

        // Display accounts before update
        System.out.println("\nAccounts before update:");
        bank.displayAccounts();

        // Update bank (process interest and fees)
        System.out.println("\nUpdating bank accounts...");
        bank.update();

        // Display accounts after update
        System.out.println("\nAccounts after update:");
        bank.displayAccounts();

        // Use the toString method
        System.out.println("\nUsing toString method for each account:");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        // Close an account
        bank.closeAccount(acc3);

        // Display accounts after closing one
        System.out.println("\nAccounts after closing Account #1002:");
        bank.displayAccounts();
		
		

	}

}
