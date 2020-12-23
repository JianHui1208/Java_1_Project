package Tutorial.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> PetArray = new ArrayList<Pet>();
        boolean keyword, keyword2 = true;
        String StrKeyword = "";
        String Name, type = "";
        do {
            System.out.print("Enter Your Pet name: ");
            Name = input.next();
            System.out.print("Enter Pet Type (Dog = D / Cat = C): ");
            type = input.next();
            if(type.equals("C")){
                Cat c1 = new Cat();
                PetArray.add(c1);
                c1.setName(Name);
            }else if(type.equals("D")){
                Dog d1 = new Dog();
                PetArray.add(d1);
                d1.setName(Name);
            }else{
                System.out.println("Enter Wrong.");
                type = input.next();
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
        
        //print
        for(int i=0; i < PetArray.size();i++){
            System.out.println("\nYour Pet Name: " + PetArray.get(i).getName());
            if(PetArray.get(i) instanceof Cat){
                System.out.println("Your Pet Type: Cat");
            }else if(PetArray.get(i) instanceof Dog){
                System.out.println("Your Pet Type: Dog");
            }
        }
        
    }
    
}
