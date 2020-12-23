package Tutorial.Q3Change;

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        boolean keyword, keyword2 = true;
        String StrKeyword = "";
        String Name, type, color = "";
        double weight;

        do {
            System.out.print("Enter Your Pet name: ");
            Name = input.next();
            System.out.print("Enter Pet Type (Dog = D / Cat = C): ");
            type = input.next();
            switch (type) {
                case "C":
                    System.out.print("Enter your pet Color: ");
                    color = input.next();
//                    c1 = new Cat(Name, type, color);
                    c1.addValue(color, type, Name);
                    break;
                case "D":
                    System.out.print("Enter your pet weight: ");
                    weight = input.nextDouble();
//                    d1 = new Dog(Name, type, weight);
                    d1.addValue(type, weight, Name);
                    break;
                default:
                    System.out.println("Enter Wrong.");
                    type = input.next();
                    break;
            }
            System.out.println("If You want stop, Enter 'STOP'! ");
            System.out.print("Enter 1 to continue: ");
            StrKeyword = input.next();
            if (StrKeyword.equals("STOP")) {
                keyword2 = false;
            } else {
                keyword2 = true;
            }
        } while (keyword = keyword2);
        
        System.out.println();
        c1.toString();
        System.out.println();
        d1.toString();
    }

}
