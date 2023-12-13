package OOP.Tasks;

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Steve Rogers", 400.0);
        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());

        account.deposit(400);
        account.withdraw(300);

    }
}


class BankAccount {
    private String accountHolder;
    private double balance;


    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Replenishment for " + amount + "$. New balance: " + balance + "$");
        }else {
            System.out.println("Invalid amount to top up.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Withdrawal " + amount + "$. New balance: " + balance + "$");
        }else{
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}