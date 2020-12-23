package Menu;

import java.util.Scanner;

public class menu {
    Scanner input = new Scanner(System.in);
    int PM1, HM2, D3, D4;
    int[] Meals = new int[99];
    int[] happy = new int[99];
    int[] dessert = new int[99];
    int[] drink = new int[99];

    public menu() {
    }

    public menu(int NewPM1, int NewHM2, int NewD3, int NewD4) {
        setMeals(NewPM1);
        setHappy(NewHM2);
        setDessert(NewD3);
        setDrinks(NewD4);
    }

    public int setMeals(int NewPM1) {
        PM1 = NewPM1;
        return PM1;
    }

    public int setHappy(int NewHM2) {
        HM2 = NewHM2;
        return HM2;
    }

    public int setDessert(int NewD3) {
        D3 = NewD3;
        return D3;
    }

    public int setDrinks(int NewD4) {
        D4 = NewD4;
        return D4;
    }

    public int Control(int options, int count) {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            switch (options) {
                case 1:
                    Meals[i] = packageMeals();
                    break;
                case 2:
                    happy[i] = happyMeals();
                    break;
                case 3:
                    dessert[i] = dessert();
                    break;
                case 4:
                    drink[i] = drinks();
                    break;
            }
        }
        return totalPrice;
    }

    public int totalPrice(int count) {
        int price = 0;
        int M = 0; // packageMeals
        int H = 0; // happyMeals
        int D = 0; // dessert
        int DK = 0; // drinks
        for (int i = 0; i < count; i++) {
            M += Meals[i];
            H += happy[i];
            D += dessert[i];
            DK += drink[i];
        }
        price = M + H + D + DK;
        return price;
    }

    public int packageMeals() {
        int foodOption1 = 0;
        int quantity = 0;
        int subTotal = 0;
        int[] foodPrice = new int[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Package Meals ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. Double McChicken        RM15    2. Spicy Chicken McDeluxe       RM30");
        System.out.println("  3. Chicken McNuggets       RM12    4. Ayam Goreng Spicy            RM25");
        System.out.print("Enter Your Food Number(Enter 5 to exit): ");
        foodOption1 = input.nextInt();
        switch (foodOption1) {
            case 1:
                System.out.print("1. Double McChicken-------------RM15\n");
                foodOption1 = foodOption1 - 1;
                break;
            case 2:
                System.out.print("2. Spicy Chicken McDeluxe-------RM30\n");
                foodOption1 = foodOption1 - 1;
                break;
            case 3:
                System.out.print("3. Chicken McNuggets------------RM12\n");
                foodOption1 = foodOption1 - 1;
                break;
            case 4:
                System.out.print("4. Ayam Goreng Spicy------------RM25\n");
                foodOption1 = foodOption1 - 1;
                break;
        }
        foodPrice[0] = 15;
        foodPrice[1] = 30;
        foodPrice[2] = 12;
        foodPrice[3] = 25;
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal = quantity * foodPrice[foodOption1];
        System.out.println("The Price is RM" + subTotal);
        return subTotal;
    }

    public int happyMeals() {
        int foodOption2 = 0;
        int quantity = 0;
        int subTotal = 0;
        int[] foodPrice2 = new int[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Happy Meals ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. 4pcs Chicken McNuggets   RM9    2. Fried Chicken McD             RM15");
        System.out.println("  3. Chicken Burger           RM10   4. Toy                           RM12");
        System.out.print("Enter Your Food Number: ");
        foodOption2 = input.nextInt();
        switch (foodOption2) {
            case 1:
                System.out.print("1. 4pcs Chicken McNuggets-------------RM9\n");
                foodOption2 = foodOption2 - 1;
                break;
            case 2:
                System.out.print("2. Fried Chicken McD-------RM15\n");
                foodOption2 = foodOption2 - 1;
                break;
            case 3:
                System.out.print("3. Chicken McNuggets------------RM10\n");
                foodOption2 = foodOption2 - 1;
                break;
            case 4:
                System.out.print("4. Ayam Goreng Spicy------------RM12\n");
                foodOption2 = foodOption2 - 1;
                break;
        }
        foodPrice2[0] = 9;
        foodPrice2[1] = 15;
        foodPrice2[2] = 10;
        foodPrice2[3] = 12;
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal = quantity * foodPrice2[foodOption2];
        System.out.println("The Price is RM" + subTotal);
        return subTotal;
    }

    public int dessert() {
        int foodOption3 = 0;
        int quantity = 0;
        int subTotal = 0;
        int[] foodPrice3 = new int[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Dessert ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. Oreo McFlurry            RM4    2. Chocolate Sundae              RM2");
        System.out.println("  3. Strawberry Sundae        RM2    4. Apple Pie                     RM6");
        System.out.print("Enter Your Food Number: ");
        foodOption3 = input.nextInt();
        switch (foodOption3) {
            case 1:
                System.out.print("1. Oreo McFlurry-------------RM4\n");
                foodOption3 = foodOption3 - 1;
                break;
            case 2:
                System.out.print("2. Chocolate Sundae-------RM2\n");
                foodOption3 = foodOption3 - 1;
                break;
            case 3:
                System.out.print("3. Strawberry Sundae------------RM2\n");
                foodOption3 = foodOption3 - 1;
                break;
            case 4:
                System.out.print("4. Apple Pie------------RM6\n");
                foodOption3 = foodOption3 - 1;
                break;
        }
        foodPrice3[0] = 4;
        foodPrice3[1] = 2;
        foodPrice3[2] = 2;
        foodPrice3[3] = 6;
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal = quantity * foodPrice3[foodOption3];
        System.out.println("The Price is RM" + subTotal);
        return subTotal;
    }

    public int drinks() {
        int foodOption4 = 0;
        int quantity = 0;
        int subTotal = 0;
        int[] foodPrice4 = new int[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Drink ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. 100 Plus                 RM3    2. Coca-Cola                     RM3");
        System.out.println("  3. Sprite                   RM3    4. Ice Lemon Tea                 RM3");
        System.out.print("Enter Your Food Number: ");
        foodOption4 = input.nextInt();
        switch (foodOption4) {
            case 1:
                System.out.print("1. 100 Plus-------------RM3\n");
                foodOption4 = foodOption4 - 1;                
                break;
            case 2:
                System.out.print("2. Coca-Cola-------RM3\n");
                foodOption4 = foodOption4 - 1;
                break;
            case 3:
                System.out.print("3. Sprite------------RM3\n");
                foodOption4 = foodOption4 - 1;
                break;
            case 4:
                System.out.print("4. Ice Lemon Tea------------RM3\n");
                foodOption4 = foodOption4 - 1;
                break;
        }
        foodPrice4[0] = 3;
        foodPrice4[1] = 3;
        foodPrice4[2] = 3;
        foodPrice4[3] = 3;
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal = quantity * foodPrice4[foodOption4];
        System.out.println("The Price is RM" + subTotal);
        return subTotal;
    }

    public static void priceMenu() {
    }
}
