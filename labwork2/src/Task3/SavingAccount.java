package Task3;

public class SavingAccount extends Account {
	
	private double interestRate;
    public SavingAccount(int AccNumber,double interestRate){
        super(AccNumber);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interestRate);
        System.out.println("Interest added: $" + String.format("%.2f", interestRate));
    }
    public String toString() {
        return "Savings " + super.toString() + " | Interest Rate: " + interestRate + "%";
    }
	
}
