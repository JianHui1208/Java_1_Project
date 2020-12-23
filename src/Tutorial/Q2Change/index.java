package Tutorial.Q2Change;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList pet = new ArrayList();
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        boolean keyword, keyword2 = true;
        String StrKeyword = "";
        String Name, type = "";

        do {
            System.out.print("Enter Your Pet name: ");
            Name = input.next();
            System.out.print("Enter Pet Type (Dog = D / Cat = C): ");
            type = input.next();
            if(type.equals("C")){
                c1.setName(Name);
                c1.setType(type);
            }else if(type.equals("D")){
                d1.setName(Name);
                d1.setType(type);
            }else{
                System.out.println("Enter Wrong.");
                type = input.next();
            }
            System.out.println("If You want stop, Enter 'STOP'! ");
            System.out.println("Enter 1 to continue.");
            StrKeyword = input.next();
            if (StrKeyword.equals("STOP")) {
                keyword2 = false;
            } else {
                keyword2 = true;
            }
        } while (keyword = keyword2);
        
        c1.toString();
        System.out.println();
        d1.toString();
    }

}
