package pizza;
import java.util.Scanner;

public final class pizza extends customer{
    Scanner input = new Scanner(System.in);
    String[] menu = new String[99];
    String[] choose = new String[99];    
    String[] address = new String[99];
    String[] Size = new String[99];
    int[] totalPrice = new int[99];
    int quantity;
    
    public pizza(){
        super();
    }
    
    public pizza(String Name, String PhoNumber, int quantity){
        super(Name, PhoNumber);
        this.quantity = quantity;
        Order();
    }
    
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public void Order(){
        int num1, num2;
        String num3;
        int PizzaPrice = 0, SizePrice = 0, ToppingsPrice = 0;
        System.out.println();
        for(int i = 0;i < this.quantity;i++){
            System.out.println("Pizza " + (i+1));
            System.out.println("It is Menu.");
            System.out.println("1. Aloha Chicken PizzaHut-----RM10");
            System.out.println("2. BBQ Chicken PizzaHut-------RM15");
            System.out.println("3. Classic Chicken PizzaHut---RM20");
            System.out.print("Select your pizza: ");
            num1 = input.nextInt();
            switch (num1) {
                case 1:
                    this.menu[i] = "Aloha Chicken PizzaHut-----RM10";
                    PizzaPrice = 10;
                    break;
                case 2:
                    this.menu[i] = "BBQ Chicken PizzaHut-------RM15";
                    PizzaPrice = 15;
                    break;
                case 3:
                    this.menu[i] = "Classic Chicken PizzaHut---RM20";
                    PizzaPrice = 20;
                    break;
            }
            System.out.print("Enter Your pizza size(S/M/L): ");
            num3 = input.next();
            switch (num3) {
                case "S":
                    this.Size[i] = "Small Pizza-----RM8";
                    SizePrice = 8;
                    break;
                case "M":
                    this.Size[i] = "Medium Pizza-----RM10";
                    SizePrice = 10;
                    break;
                case "L":
                    this.Size[i] = "Large Pizza-----RM12";
                    SizePrice = 12;
                    break;
            }
            System.out.println("You can choose a combination.");
            System.out.println("1. Pepperoni-----RM2");
            System.out.println("2. Sausag--------RM2");
            System.out.println("3. Mushroom------RM2");
            System.out.println("4. Pepperoni and Sausage------RM4");
            System.out.println("5. Pepperoni and Mushroom------RM4");
            System.out.println("6. Sausage and Mushroom------RM4");
            System.out.println("7. Pepperoni, Sausage and Mushroom------RM6");
            System.out.println("8. None");
            System.out.print("Please Enter the number: ");
            num2 = input.nextInt();
            switch (num2) {
                case 1:
                    this.choose[i] = "Pepperoni-----RM2";
                    ToppingsPrice = 2;
                    break;
                case 2:
                    this.choose[i] = "Sausage--------RM2";
                    ToppingsPrice = 2;
                    break;
                case 3:
                    this.choose[i] = "Mushroom------RM2";
                    ToppingsPrice = 2;
                    break;
                case 4:
                    this.choose[i] = "Pepperoni and Sausage------RM4";
                    ToppingsPrice = 4;
                    break;
                case 5:
                    this.choose[i] = "Pepperoni and Mushroom------RM4";
                    ToppingsPrice = 4;
                    break;
                case 6:
                    this.choose[i] = "Sausage and Mushroom------RM4";
                    ToppingsPrice = 4;
                    break;
                case 7:
                    this.choose[i] = "Pepperoni, Sausage and Mushroom------RM6";
                    ToppingsPrice = 6;
                    break;
                case 8:
                    this.choose[i] = "None------RM0";
                    ToppingsPrice = 0;
                    break;
            }
            System.out.print("Enetr your address: ");
            this.address[i] = input.next();
            this.totalPrice[i] = PizzaPrice + SizePrice + ToppingsPrice;
            System.out.println();
        }
    }
    
    @Override
    public String toString(){
        String MSG="";
        int totalPrice = 0;
        System.out.println();
        System.out.println("---Your Receipt---");
        System.out.println();
        super.toString();
        System.out.println();
        for(int j = 0;j < this.menu.length; j++){
            totalPrice+=this.totalPrice[j];
            if(this.menu[j]!=null && this.choose[j]!=null && this.address[j]!=null){
                System.out.println((j+1) +". "+ this.menu[j]);
                System.out.println("Your Pizza Size: "+this.Size[j]);
                System.out.println("Your Toppings: "+this.choose[j]);
                System.out.println("Your Address: "+this.address[j]);
                System.out.println();
            }
        }
        System.out.println("Your Total Price: RM" + totalPrice);
        System.out.println();
        return MSG;
    }
}
