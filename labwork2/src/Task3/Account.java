package Task3;

public class Account {

	private double balance;
    private int AccNumber;

    public Account(int a){
        balance = 0.0;
        AccNumber = a;
    }
    
    public void deposit(double sum){
        if(sum > 0){
            balance += sum;
            System.out.println("Deposited $ " + sum);
        }else{
            System.out.println("sum must be positive");
        }
    }
    
    public void withdraw(double sum){
        if(sum > 0){
            if(balance >= sum){
                balance -= sum;
                System.out.println("Withdrawed $ " + sum);
            }else{
                System.out.println("sum must be less than balance");
            }
        }else{
            System.out.println("sum must be positive");
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getAccNumber(){
        return AccNumber;
    }

    public void transfer(double amount,Account other){
        if(amount > 0){
            if(amount <= balance){
                balance -= amount;
                other.deposit(amount);
            }else{
                System.out.println("amount must be less or equal to balance");
            }
        }else{
            System.out.println("amount must be positive");
        }
    }
    public String toString() {
        return "Account #" + AccNumber + " | Balance: $" + String.format("%.2f", balance);
    }
    
    public final void print() {
        // Don't override this, override the toString method
        System.out.println(toString());
    }
}
