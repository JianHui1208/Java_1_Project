package OOPProject;

import java.util.Scanner;

public class menu {
    Scanner input = new Scanner(System.in);
    int packageMeals, happyMeals, desserts, drinks;
    int[] subTotal = new int[99];
    String[] OrderName = new String[99];
    int[] FoodQuantity = new int[99];
    int count = 0;

    public menu() {
    }

    public menu(int newPackageMeals, int newHappyMeals, int newDesserts, int newDrinks) {
        setPackageMeals(newPackageMeals);
        setHappyMeals(newHappyMeals);
        setDesserts(newDesserts);
        setDrinks(newDrinks);
    }

    public int setPackageMeals(int newPackageMeals) {
        this.packageMeals = newPackageMeals;
        return this.packageMeals;
    }

    public int setHappyMeals(int newHappyMeals) {
        this.happyMeals = newHappyMeals;
        return this.happyMeals;
    }

    public int setDesserts(int newDesserts) {
        this.desserts = newDesserts;
        return this.desserts;
    }

    public int setDrinks(int newDrinks) {
        this.drinks = newDrinks;
        return this.drinks;
    }

    public int Control(int count) {
        int alltotal = 0;
        for (int i = 0; i < count; i++) {
            alltotal += subTotal[i];
        }
        System.out.println("Here is Your Receipt.\n");
        for (int i = 1; i < count; i++) {
            System.out.println(i + ". " + OrderName[i] + " * " + FoodQuantity[i]);
        }
        System.out.println("\nTotal price is: RM" + alltotal);
        return alltotal;
    }

    public String Payment(double payment, int count) {
        String MSG = "";
        int totoalprice = Control(count);
        if (payment < totoalprice) {
            System.out.println("\nInconsistent Amount!!! Pls Enter angin.");
            payment = input.nextInt();
        }
        double Change = payment - Control(count);
        if (Change > 0) {
            System.out.println("\nHere is Your Change: RM" + Change);
            System.out.println("Welcome to visit next time.");
        } else {
            System.out.println("\nWelcome to visit next time.");
        }

        return MSG;
    }

    public int[] packageMeals(int count) {
        int foodOption1 = 0;
        int quantity = 0;
        int SUBTOTAL = 0;
        int[] foodPrice = new int[4];
        String[] FoodName = new String[4];
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                            Package Meals                                ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("  1. Double McChicken        RM15    2. Spicy Chicken McDeluxe       RM30");
        System.out.println("  3. Chicken McNuggets       RM12    4. Ayam Goreng Spicy            RM25");
        System.out.print("Enter Your Food Number: ");
        foodOption1 = input.nextInt();
        if (foodOption1 >= 5 || foodOption1 == 0) {
            System.out.print("Not available food.Please re-enter food Number: ");
            foodOption1 = input.nextInt();
        }
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
        FoodName[0] = "Double McChicken-----------------RM15";
        FoodName[1] = "Spicy Chicken McDeluxe-----------RM30";
        FoodName[2] = "Chicken McNuggets----------------RM12";
        FoodName[3] = "Ayam Goreng Spicy----------------RM25";
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal[count] = quantity * foodPrice[foodOption1];
        SUBTOTAL = subTotal[count];
        this.FoodQuantity[count] = quantity;
        this.OrderName[count] = FoodName[foodOption1];
        System.out.println("The Price is RM" + SUBTOTAL);
        return subTotal;
    }

    public int[] happyMeals(int count) {
        int foodOption2 = 0;
        int quantity = 0;
        int SUBTOTAL = 0;
        int[] foodPrice2 = new int[4];
        String[] FoodName = new String[4];
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                              Happy Meals                                 ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("  1. 4pcs Chicken McNuggets   RM9    2. Fried Chicken McD             RM15");
        System.out.println("  3. Chicken Burger           RM10   4. Toy                           RM12");
        System.out.print("Enter Your Food Number: ");
        foodOption2 = input.nextInt();
        if (foodOption2 >= 5) {
            System.out.print("Not available food.Please re-enter food Number: ");
            foodOption2 = input.nextInt();
        }
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
                System.out.print("4. 4. Toy                           RM12\n");
                foodOption2 = foodOption2 - 1;
                break;
        }
        foodPrice2[0] = 9;
        foodPrice2[1] = 15;
        foodPrice2[2] = 10;
        foodPrice2[3] = 12;
        FoodName[0] = "4pcs Chicken McNuggets------------RM9";
        FoodName[1] = "Fried Chicken McD----------------RM15";
        FoodName[2] = "Chicken McNuggets----------------RM10";
        FoodName[3] = "Toy------------------------------RM12";
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal[count] = quantity * foodPrice2[foodOption2];
        SUBTOTAL = subTotal[count];
        this.FoodQuantity[count] = quantity;
        this.OrderName[count] = FoodName[foodOption2];
        System.out.println("The Price is RM" + SUBTOTAL);
        return subTotal;
    }

    public int[] desserts(int count) {
        int foodOption3 = 0;
        int quantity = 0;
        int SUBTOTAL = 0;
        int[] foodPrice3 = new int[4];
        String[] FoodName = new String[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Dessert ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. Oreo McFlurry            RM4    2. Chocolate Sundae              RM2");
        System.out.println("  3. Strawberry Sundae        RM2    4. Apple Pie                     RM6");
        System.out.print("Enter Your Food Number: ");
        foodOption3 = input.nextInt();
        if (foodOption3 >= 5) {
            System.out.print("Not available food.Please re-enter food Number: ");
            foodOption3 = input.nextInt();
        }
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
        FoodName[0] = "Oreo McFlurry---------------------RM4";
        FoodName[1] = "Chocolate Sundae------------------RM2";
        FoodName[2] = "Strawberry Sundae-----------------RM2";
        FoodName[3] = "Apple Pie-------------------------RM6";
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal[count] = quantity * foodPrice3[foodOption3];
        SUBTOTAL = subTotal[count];
        this.FoodQuantity[count] = quantity;
        this.OrderName[count] = FoodName[foodOption3];
        System.out.println("The Price is RM" + SUBTOTAL);
        return subTotal;
    }

    public int[] drinks(int count) {
        int foodOption4 = 0;
        int quantity = 0;
        int SUBTOTAL = 0;
        int[] foodPrice4 = new int[4];
        String[] FoodName = new String[4];
        System.out.println("-------------------------------------------------------------");
        System.out.println("                         Drink ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("  1. 100 Plus                 RM3    2. Coca-Cola                     RM3");
        System.out.println("  3. Sprite                   RM3    4. Ice Lemon Tea                 RM3");
        System.out.print("Enter Your Food Number: ");
        foodOption4 = input.nextInt();
        if (foodOption4 >= 5) {
            System.out.print("Not available food.Please re-enter food Number: ");
            foodOption4 = input.nextInt();
        }
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
        FoodName[0] = "100 Plus---------------------------RM3";
        FoodName[1] = "Coca-Cola--------------------------RM3";
        FoodName[2] = "Sprite-----------------------------RM3";
        FoodName[3] = "Ice Lemon Tea----------------------RM3";
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        subTotal[count] = quantity * foodPrice4[foodOption4];
        SUBTOTAL = subTotal[count];
        this.FoodQuantity[count] = quantity;
        this.OrderName[count] = FoodName[foodOption4];
        System.out.println("The Price is RM" + SUBTOTAL);
        return subTotal;
    }
}
