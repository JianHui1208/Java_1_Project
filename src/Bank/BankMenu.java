//Name: William Gwee Jian Hui
//Students ID: D190067A
//Batch: IT-19A

package Bank;

import java.util.Scanner;

public class BankMenu {

    public static void main(String[] args) {
        BankAccount[] B1 = new BankAccount[10];
        Scanner input = new Scanner(System.in);
        int Number = 0;
        double amount, withdraw, deposit = 0;
        String HolderNum, HolderName;

//        do {
            for (int i = 0; i < B1.length; i++) {
                System.out.println("Welcome Bank!!!");
                System.out.println("1. Create Bank Account");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.print("Select 1-3, Enter 0 to exit.");
                Number = input.nextInt();
                switch (Number) {
                    case 0:
                        System.out.println("Bye Bye");
                        System.exit(0);
                        
                    case 1:
                        System.out.print("Enter holder name: ");
                        HolderName = input.next();
                        System.out.print("Enter balance: RM");
                        amount = input.nextDouble();
                        B1[i] = new BankAccount(HolderName, amount);
                        B1[i].DisplayCreate();
                        break;
                        
                    case 2:
                        System.out.print("Enter Your Holder Number: ");
                        HolderNum = input.next();
                        for (int x = 0; x < B1.length; x++) {
                            if (HolderNum.equals(B1[x].getHolderNumber())) {
                                System.out.print("Enter Withdraw Amount: RM");
                                withdraw = input.nextDouble();
                                B1[x].setWithdraw(withdraw, HolderNum);
                                B1[x].DisplayNewAmount();
                                break;
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.print("Enter Your Holder Number: ");
                        HolderNum = input.next();
                        for (int x = 0; x < B1.length; x++) {
                            if (HolderNum.equals(B1[x].getHolderNumber())) {
                                System.out.print("Enter Deposit Amount: RM");
                                deposit = input.nextDouble();
                                B1[x].setDeposit(deposit, HolderNum);
                                B1[x].DisplayNewAmount();
                                break;
                            }
                        }
                        break;
                }
            }
//        } while (Number != 3);
    }
}
