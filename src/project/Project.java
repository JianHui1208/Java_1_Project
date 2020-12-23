/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author William
 */
public class Project {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int keyword;
        int count = 0;
        String[] strName = new String[10];
        String[] strPhoneNum = new String[10];
        String[] strDate = new String[10];
        String[] strEmail = new String[10];
        String[] strtotal = new String[10];

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("           Welcome to McDonald`s ");
            System.out.println("--------------------------------------------------------");
            System.out.print("Enter 1 to Order,Enter 2 to Receipt,Enter 3 to exit: ");
            keyword = input.nextInt();
            switch (keyword) {
                case 1:
                    count = Booking(strName, strPhoneNum, strDate, strEmail, count, strtotal);
                    break;
                case 2:
                    Receipt(strName, strPhoneNum, strDate, strEmail, count, strtotal);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    if (keyword <= 1 || keyword >= 3) {
                        System.out.println("Wrong Number.Please Enter Angin.");
                    }
            }
        } while (keyword != 3);
    }

    public static int Booking(String[] strName, String[] strPhoneNum, String[] strDate, String[] strEmail, int count,
            String[] strtotal) {
        Scanner input = new Scanner(System.in);
        double alltotal = 0;

        System.out.println("--------------------------------------------------------");
        System.out.println("           Welcome to McDonald`s ");
        System.out.println("--------------------------------------------------------");

        System.out.print("Today's Date is ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.print("Enter your name : ");
        strName[count] = input.next();
        System.out.print("Enter your phone number : ");
        strPhoneNum[count] = input.next();
        System.out.print("Enter your email : ");
        strEmail[count] = input.next();

        // payment method
        System.out.print("Do you want to pay with cash or credit card ? \nCash (Enter 1),Credit card (Enter 2): ");
        int payMethods = input.nextInt();
        if (payMethods != 1 && payMethods != 2) {
            System.out.println("Wrong Number.Please Enter Angin.\nCash (Enter 1),Credit card (Enter 2): ");
            payMethods = input.nextInt();

        }
        if (payMethods == 2) {
            System.out.print("Enter your card number : ");
            int cardNum = input.nextInt();
        }

        // buy method
        System.out.print(
                "If you want to eat here (Enter 1), take away (Enter 2), \ndelivery (Enter 3) or cancel (Enter 4) : ");
        int buyMethods = input.nextInt();

        if (buyMethods == 3) {
            System.out.print("Enter your address : ");
            String address = input.next();
        }

        if (buyMethods != 4) {
            System.out.print("Enter 1 to show the McDonald`s menu : ");
            int menu = input.nextInt();
            if (menu == 1) {
                int meNu = Menu(alltotal, count, strtotal);
            } else if (menu != 1) {
                System.out.println("Return to Booking.Please follow the instruction.");
            }
        }
        count++;
        return count++;
    }

    public static int Menu(double alltotal, int count, String[] strtotal) {
        Scanner input = new Scanner(System.in);
        int quantity;

        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Menu ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Package Meals (/Include drinks & french fries/) : ");

        System.out.println("  1. Double McChicken        RM15    2. Spicy Chicken McDeluxe       RM30");
        System.out.println("  3. Chicken McNuggets       RM12    4. Ayam Goreng Spicy            RM25");
        System.out.println("  5. Filet-O-Fish            RM7");

        System.out.println("-------------------------------------------------------------");
        System.out.println("AlaCarte Meals : ");

        System.out.println("  6. Mchicken Burger          RM7    7. Double McChicken                RM10");
        System.out.println("  8. Spicy Chicken Deluxe     RM25   9. Double Spicy Chicken Deluxe     RM10");
        System.out.println("  10. Double Cheese Burger    RM13   11. Triple Cheese Burger           RM15");
        System.out.println("  12. Double Fish-O-Fish      RM7    13. Filet-O-Fish                   RM10");
        System.out.println("  14. Fried Chicken McD 2pcs  RM20   15. Fried Chicken McD (Spicy)      RM20");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Dessert : ");

        System.out.println("  16. Oreo McFlurry            RM4    17. Chocolate Sundae              RM2");
        System.out.println("  18. Strawberry Sundae        RM2    19. Apple Pie                     RM6");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Drinks : ");

        System.out.println("  20. 100 Plus                 RM3    21. Coca-Cola                     RM3");
        System.out.println("  22. Sprite                   RM3    23. Ice Lemon Tea                 RM3");
        System.out.println("  23. Ice Lemon Tea            RM3    24. Milo                          RM3");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Happy Meal: ");

        System.out.println("  25. Chicken Porridge McD     RM7    26. CheeseBurger                  RM10");
        System.out.println("  27. 4pcs Chicken McNuggets   RM9    28. Fried Chicken McD             RM15");
        System.out.println("  29. Chicken Burger           RM10   30. Toy                           RM12");

        System.out.print("Enter Your Food Number : ");
        int foodNum = input.nextInt();

        switch (foodNum) {
            case 1:
                System.out.print("1. Double McChicken-------------RM15");
                foodNum = foodNum - 1;
                break;
            case 2:
                System.out.print("2. Spicy Chicken McDeluxe-------RM30");
                foodNum = foodNum - 1;
                break;
            case 3:
                System.out.print("3. Chicken McNuggets------------RM12");
                foodNum = foodNum - 1;
                break;
            case 4:
                System.out.print("4. Ayam Goreng Spicy------------RM25");
                foodNum = foodNum - 1;
                break;
            case 5:
                System.out.print("5. Filet-O-Fish-----------------RM7");
                foodNum = foodNum - 1;
                break;
            case 6:
                System.out.print("6. Mchicken Burger--------------RM7");
                foodNum = foodNum - 1;
                break;
            case 7:
                System.out.print("7. Double McChicken-------------RM10");
                foodNum = foodNum - 1;
                break;
            case 8:
                System.out.print("8. Spicy Chicken Deluxe---------RM25");
                foodNum = foodNum - 1;
                break;
            case 9:
                System.out.print("9. Double Spicy Chicken Deluxe--RM10");
                foodNum = foodNum - 1;
                break;
            case 10:
                System.out.print("10. Double Cheese Burger-------RM13");
                foodNum = foodNum - 1;
                break;
            case 11:
                System.out.print("11. Triple Cheese Burger-------RM15");
                foodNum = foodNum - 1;
                break;
            case 12:
                System.out.print("12. Double Fish-O-Fish---------RM7");
                foodNum = foodNum - 1;
                break;
            case 13:
                System.out.print("13. Filet-O-Fish---------------RM10");
                foodNum = foodNum - 1;
                break;
            case 14:
                System.out.print("14. Fried Chicken McD 2pcs-----RM20");
                foodNum = foodNum - 1;
                break;
            case 15:
                System.out.print("15. Fried Chicken McD (Spicy)--RM20");
                foodNum = foodNum - 1;
                break;
            case 16:
                System.out.print("16. Oreo McFlurry--------------RM4");
                foodNum = foodNum - 1;
                break;
            case 17:
                System.out.print("17. Chocolate Sundae-----------RM2");
                foodNum = foodNum - 1;
                break;
            case 18:
                System.out.print("18. Strawberry Sundae----------RM2");
                foodNum = foodNum - 1;
                break;
            case 19:
                System.out.print("19. Apple Pie------------------RM6");
                foodNum = foodNum - 1;
                break;
            case 20:
                System.out.print("20. 100 Plus-------------------RM3");
                foodNum = foodNum - 1;
                break;
            case 21:
                System.out.print("21. Coca-Cola------------------RM3");
                foodNum = foodNum - 1;
                break;
            case 22:
                System.out.print("22. Sprite---------------------RM3");
                foodNum = foodNum - 1;
                break;
            case 23:
                System.out.print("23. Ice Lemon Tea--------------RM3");
                foodNum = foodNum - 1;
                break;
            case 24:
                System.out.print("24. Milo-----------------------RM3");
                foodNum = foodNum - 1;
                break;
            case 25:
                System.out.print("25. Chicken Porridge McD-------RM7");
                foodNum = foodNum - 1;
                break;
            case 26:
                System.out.print("26. CheeseBurger---------------RM10");
                foodNum = foodNum - 1;
                break;
            case 27:
                System.out.print("27. 4pcs Chicken McNuggets-----RM9");
                foodNum = foodNum - 1;
                break;
            case 28:
                System.out.print("28. Fried Chicken McD----------RM15");
                foodNum = foodNum - 1;
                break;
            case 29:
                System.out.print("29. Chicken Burger-------------RM10");
                foodNum = foodNum - 1;
                break;
            case 30:
                System.out.print("30. Toy------------------------RM12");
                foodNum = foodNum - 1;
                break;
        }

        double[] foodPrice = new double[30];
        foodPrice[0] = 15;
        foodPrice[1] = 30;
        foodPrice[2] = 12;
        foodPrice[3] = 25;
        foodPrice[4] = 7;
        foodPrice[5] = 7;
        foodPrice[6] = 10;
        foodPrice[7] = 25;
        foodPrice[8] = 10;
        foodPrice[9] = 13;
        foodPrice[10] = 15;
        foodPrice[11] = 7;
        foodPrice[12] = 10;
        foodPrice[13] = 20;
        foodPrice[14] = 20;
        foodPrice[15] = 4;
        foodPrice[16] = 2;
        foodPrice[17] = 2;
        foodPrice[18] = 6;
        foodPrice[19] = 3;
        foodPrice[20] = 3;
        foodPrice[21] = 3;
        foodPrice[22] = 3;
        foodPrice[23] = 3;
        foodPrice[24] = 7;
        foodPrice[25] = 10;
        foodPrice[26] = 9;
        foodPrice[27] = 15;
        foodPrice[28] = 10;
        foodPrice[29] = 12;

        // quantity
        System.out.print("\nQuantity : ");
        quantity = input.nextInt();
        // total
        double subTotal;
        subTotal = quantity * foodPrice[foodNum];
        System.out.println("The Price is RM" + subTotal);
        alltotal = alltotal + subTotal;
        strtotal[count] = String.valueOf(alltotal);
        // confirm order
        System.out.print("Do you continue your order ? Yes (Enter 1),No(Enter 2): ");
        int confirm = input.nextInt();
        do {
            switch (confirm) {
                case 1:
                    quantity = Menu(alltotal, count, strtotal);
                    break;
                case 2:
                    System.out.println("Total price is : RM " + alltotal);
                    break;
                default:
                    System.out.println("Worng Number.Please follow the instruction.");
                    System.out.print("Do you continue your order? Yes (Enter 1), No(Enter 2): ");
                    confirm = input.nextInt();
                    if (confirm == 1) {
                        quantity = Menu(alltotal, count, strtotal);
                    } else if (confirm == 2) {
                        System.out.println("Total price is : RM " + alltotal);
                    }
                    break;
            }
        } while (confirm != 1 && confirm != 2);
        return quantity;
    }

    public static void Receipt(String[] strName, String[] strPhoneNum, String[] strDate, String[] strEmail, int count,
            String[] strtotal) {
        Scanner input = new Scanner(System.in);
        int data = 0;
        System.out.print("Enter your name: ");
        String name = input.next();
        for (int a = 0; a < count; a++) {
            if (strName[a].equals(name)) {
                data = a;
            }
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("                       Receipt ");
        System.out.println("-------------------------------------------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date: " + dtf.format(now));
        System.out.println("Name: " + name);
        
        if (strPhoneNum[data] == null) {
            System.out.println("Phone Number: ");
        } else {
            System.out.println("Phone Number: " + strPhoneNum[data] + count);
        }
        
        if (strEmail[data] == null) {
            System.out.println("Email: ");
        } else {
            System.out.println("Email: " + strEmail[data]);
        }
        
        if (strtotal[data] == null) {
            System.out.println("Total Price :RM0");
        } else {
            System.out.println("Total Price: RM" + strtotal[data]);
        }
    }
}
