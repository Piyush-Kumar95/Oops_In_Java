
class BankApp{

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    void Deposit(double amount){

        balance = balance + amount;
        System.out.println("You Have Deposit "+amount+" Rs.");
        System.out.println("Your New Balance "+getBalance()+" Rs.");
    }

    void Withdraw(double amount){

        balance = balance - amount;
        System.out.println("You Have Withdraw "+amount+" Rs.");
        System.out.println("Your New Balance "+getBalance()+" Rs.");
    }
}


public class Oops_Encapsulation {
    public static void main(String[] args) {


        BankApp obj = new BankApp();

        // Write a Deposit Amount
        obj.Deposit(5000);

        System.out.println();

        // Write a Withdraw Amount
        obj.Withdraw(500);


    }
}
