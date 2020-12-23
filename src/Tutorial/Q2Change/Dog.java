package Tutorial.Q2Change;

import java.util.ArrayList;

public class Dog extends Pet {
    ArrayList TypeArray = new ArrayList();
    private String type;

    public Dog() {
        super();
    }

    public Dog(String name, String type) {
        super(name);
        this.type = type;
        this.TypeArray.add(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String petType) {
        this.type = petType;
        this.TypeArray.add(petType);
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println("This is Dog Type List.");
        for(int i=0; i < TypeArray.size();i++){
            System.out.println("Your Pet Name: " + NameArray.get(i));
            System.out.println("Your Pet Type: " + TypeArray.get(i));
        }
        return MSG;
    }
    @Override
    public String speak() {
        return "Yes, master. Fetch i will.";
    }
}
