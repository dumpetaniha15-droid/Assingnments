package BankAccount;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(){
        accountHolder = "Niharika";
        accountNumber = 1234567890l;
        balance = 1000;
    }

    void deposite(double amount){
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("withdraw amount: " + amount);
        }else{
            System.out.println("Insufficient funds");
        }
    }
    void Details(){
        System.out.println("----welcome to our Bank account----");
        System.out.println("Account Holder name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
    void Balance(){
        System.out.println("Final Balance: " + balance);
    }
}

