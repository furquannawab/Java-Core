package classes;

public class BankAccount {
    private final String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
        else
            System.out.println("Incorrect Amount Entered");
    }

    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
        }
        else
            System.out.println("Wrong input");
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
