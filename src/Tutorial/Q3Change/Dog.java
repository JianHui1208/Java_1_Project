package Tutorial.Q3Change;

import java.util.ArrayList;

public class Dog extends Pet {
    ArrayList TypeArray = new ArrayList();
    private String type;
    private double weight;

    public Dog() {
        super();
    }

    public Dog(String Name, String type, double weight) {
        super(Name);
        this.type = type;
        this.weight = weight;
        TypeArray.add(Name);
        TypeArray.add(type);
        TypeArray.add(weight);
    }

    public String getType() {
        return this.type;
    }

    public void setType(String petType) {
        this.type = petType;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void addValue(String type, double weight, String Name){
        super.setName(Name);
        TypeArray.add(Name);
        TypeArray.add(type);
        TypeArray.add(weight);
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println("----------------------");
        System.out.println("This is Dog Type List.");
        System.out.println("----------------------");
        for(int i=0; i < TypeArray.size();i++){
//            System.out.println("Your Pet Name: " + NameArray.get(i));
            if(i == 0 || i%3 == 0) {
                System.out.println("Your Pet Name: " + TypeArray.get(i));
            } else if(i == 1 || i%3 == 1){
                System.out.println("Your Pet Type: " + TypeArray.get(i));
            } else if(i == 2 || i%3 == 2){
                System.out.println("Your Pet Weight: " + TypeArray.get(i)+ "kg");
                System.out.println();
            }
        }
        return MSG;
    }
    @Override
    public String speak() {
        return "Yes, master. Fetch i will.";
    }
}
