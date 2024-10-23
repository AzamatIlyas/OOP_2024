package Task3;

import java.util.*;

public class Bank {
	
	private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>(); // Correctly initializing the instance variable
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: Account #" + account.getAccNumber());
    }

    public void closeAccount(Account account){
        accounts.remove(account);
        System.out.println("Account closed: Account #" + account.getAccNumber());
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
