package Tutorial.Q3Change;

import java.util.ArrayList;

public class Cat extends Pet {
    ArrayList TypeArray = new ArrayList();
    private String type, color;
    
    public Cat() {
        super();
    }

    public Cat(String Name, String type, String color) {
        super(Name);
        this.type = type;
        this.color = color;
        TypeArray.add(Name);
        TypeArray.add(type);
        TypeArray.add(color);
    }

    public String getType() {
        return type;
    }

    public void setType(String petType) {
        this.type = petType;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void addValue(String color, String Type, String Name){
        super.setName(Name);
        TypeArray.add(Name);
        TypeArray.add(Type);
        TypeArray.add(color);
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println("----------------------");
        System.out.println("This is Cat Type List.");
        System.out.println("----------------------");
        for(int i=0; i < TypeArray.size();i++){
            if(i == 0 || i%3 == 0) {
                System.out.println("Your Pet Name: " + TypeArray.get(i));
            } else if(i == 1 || i%3 == 1){
                System.out.println("Your Pet Type: " + TypeArray.get(i));
            } else if(i == 2 || i%3 == 2){
                System.out.println("Your Pet Color: " + TypeArray.get(i));
                System.out.println();
            }
        }
        return MSG;
    }
    
    @Override
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }
}
