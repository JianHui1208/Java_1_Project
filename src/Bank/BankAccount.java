//Name: William Gwee Jian Hui
//Students ID: D190067A
//Batch: IT-19A

package Bank;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class BankAccount {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    String CreateDate = dtf.format(now);
    String HolderName, HolderNumber;
    static int CountOfAccount;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String newHolderName, double newBalance) {
        CountOfAccount++;
        setHolderName(newHolderName);
        setBalance(newBalance);
    }

    private double setBalance(double newBalance) {
        if (newBalance > 0) {
            balance = newBalance;
        }else{
            System.out.println("Negative Values cannot be entered.");
            balance = 0;
        }
        return balance;
    }

    private String setHolderName(String newHolderName) {
        HolderName = newHolderName;
        return HolderName;
    }

    private String setHolderNumber() {
        this.HolderNumber = String.format("%4s", CountOfAccount).replace(" ", "0");
        return HolderNumber;
    }

    public String getHolderNumber() {
        return HolderNumber;
    }

    public String getCreatedDate() {
        return CreateDate;
    }

    public double setWithdraw(double withdraw, String newHolderNumber) {
        if(withdraw > balance){
            System.out.println("You can't take out more than your account amount.");
        }else
            balance = balance - withdraw;
            this.HolderNumber = newHolderNumber;
        return balance;
    }

    public double setDeposit(double deposit, String newHolderNumber) {
        if(deposit < 0){
            System.out.println("Negative Values cannot be entered.");
        }else
            balance = balance + deposit;
            this.HolderNumber = newHolderNumber;
        return balance;
    }

    public void DisplayCreate() {
        System.out.println("\nHolder Name: " + setHolderName(HolderName) + "\n" + "Holder Number: "
                + setHolderNumber() + "\n" + "Account Balance Amount: RM" + setBalance(balance)
                + "\nCreate Date: " + getCreatedDate() + "\n");
    }

    public void DisplayNewAmount() {
        System.out.println("\nHolder Name: " + setHolderName(HolderName) + "\n" + "Holder Number: "
            + getHolderNumber() + "\n" + "Account Balance Amount: RM" + setBalance(balance) + "\n");
    }

}
