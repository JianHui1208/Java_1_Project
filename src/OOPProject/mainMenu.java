package OOPProject;

import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        double payment;
        int count = 0;
        menu menu = new menu();
        do {
            count++;
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                                   Menu                                       ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Enter 1 to Package Meals,2 to HappyMeals,3 to Dessert,4 to drinks or 5 to exit: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    menu.packageMeals(count);
                    break;
                case 2:
                    menu.happyMeals(count);
                    break;
                case 3:
                    menu.desserts(count);
                    break;
                case 4:
                    menu.drinks(count);
                    break;
            }
        } while (option != 5);
        System.out.println();
        menu.Control(count);
        System.out.print("Enter Your Paymnet Money: RM");
        payment = input.nextDouble();
        menu.Payment(payment, count);
    }
}
