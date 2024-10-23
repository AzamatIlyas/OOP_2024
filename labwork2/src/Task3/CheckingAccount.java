package Task3;

public class CheckingAccount extends Account {
	private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;
    public CheckingAccount(int AccNumber){
        super(AccNumber);
        this.transactionCount = 0;
    }
    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
    }
    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }
    public void deductFee(){
        int tries = transactionCount - FREE_TRANSACTIONS;
        if(tries > 0){
            double fees = tries * TRANSACTION_FEE;
            super.withdraw(fees);
            System.out.println("Fees deducted: $" + String.format("%.2f", fees));
        }else{
            System.out.println("No fees deducted.");
        }
        transactionCount = 0;
    }
    public String toString() {
        return "Checking " + super.toString() + " | Transactions: " + transactionCount;
    }
}
