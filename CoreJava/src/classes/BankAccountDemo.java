package classes;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount("Mike", 1000);
        System.out.println(sbi.getBalance());
        sbi.deposit(100);
        sbi.withdraw(500);
        System.out.println(sbi.getBalance());
    }
}
