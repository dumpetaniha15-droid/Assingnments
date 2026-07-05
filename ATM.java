public class ATM{
    static String bankName = "skill sprint Technology";
    static long accountNumber = 1234567890l;
    static String accountHolderName = "Niharika";
    static long mobileNumber = 7815944014l;
    static int Balance = 1000;
    static int pin = 9848;

    public static void main(String[] args){
        welcome();
        checkBalance();
        checkPin(1234);
        deposit(500);
        withdraw(300);
        checkBalance();
        changePin(4321);
        changeAccountNumber(1234512345l);
        changeName("Himawari");
        changeMobileNumber(9848234562l);
        changeBankName("SBI");


}
    public static void welcome(){
        System.out.println("welcome to: " + bankName);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accountHolderName: " + accountHolderName);
        System.out.println("mobileNumber: " + mobileNumber); 
        }
    public static void deposit(int amount){
        Balance += amount;                                       //Current B:1000
        System.out.println("Deposit: " + amount);               //amount:500
        System.out.println("Updated Balence: " + Balance);       //UB:1500

    }
    public static void withdraw(int amount){
        if(amount<=Balance){
            Balance-=amount;
            System.out.println("withdraw: " + amount);             //W:300
            System.out.println("Updated Balence: " + Balance);     //UB:1200
        }else{
            System.out.println("Insufficient funds: ");
        }
    }
    public static void checkBalance(){
        System.out.println("current Balance: "+ Balance);
    }    
    public static void checkPin(int enteredPin){
        if(enteredPin == pin){
            System.out.println("PIN is correct");
        }else{
            System.out.println("PIN is incorrect");
        }
    }
    public static void changePin(int newPin){
        pin = newPin;
        System.out.println("Pin changed successfully: " + pin);
    }
    public static void changeAccountNumber(long newNumber){
        accountNumber = newNumber;
        System.out.println("account number changed to: " + accountNumber);
    }
    public static void changeName(String newaccountHolderName){
        accountHolderName =newaccountHolderName;
        System.out.println("account Holder name changed to: " + accountHolderName);
    }  
    public static void changeMobileNumber(long newNumber){
        mobileNumber = newNumber;
        System.out.println("mobile number changed to: " + mobileNumber);
    }
    public static void changeBankName(String newbankName){
        bankName = newbankName;
        System.out.println("Bank name changed successfully To: " + bankName);
    }

}




