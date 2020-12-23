package pizza;
import java.util.Scanner;
public class index {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for(int i=0; i<10; i++){
        pizza p1 = new pizza();
        System.out.print("Enter Your name: ");
        String Name = input.next();
        p1.setName(Name);
        System.out.print("Enter Your Phone Number: ");
        String Phone = input.next();
        p1.setPhoNumber(Phone);
        System.out.print("Enter Your Pizza Quantity: ");
        int quantity = input.nextInt();
        p1.setQuantity(quantity);
        p1.Order();
        p1.toString();
    }
        
//        Other Method
//        pizza p2 = new pizza("Ali","012-9652348",2);
//        p2.toString();
    }
}
