/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import java.util.Scanner;
/**
 *
 * @author William
 */
public class mainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        int count = 0;
        menu m1 = new menu();
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("                         Menu ");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Enter 1 to Package Meals,2 to HappyMeals,3 to Dessert,4 to drinks: ");
            option = input.nextInt();
            
            count++;
            m1.Control(option, count);
        } while (option != 5);
        System.out.println("Total Price: RM" + m1.totalPrice(count));
    }
}
