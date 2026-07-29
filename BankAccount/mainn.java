package BankAccount;

public class mainn {
       public static void main(String[] args){

        BankAccount B = new BankAccount();
        B.Details();
        B.deposite(500);        //1000+500=1500
        B.withdraw(1000);       //1500-1000=500 total balance is '500'
        B.Balance();
    }
}

