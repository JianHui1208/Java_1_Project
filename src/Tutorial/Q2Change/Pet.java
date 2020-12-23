package Tutorial.Q2Change;

import java.util.ArrayList;

public class Pet {
    ArrayList NameArray = new ArrayList();
    private String name;
    
    public Pet(){}
    public Pet(String Name){
        this.name = Name;
        this.NameArray.add(Name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String petName) {
        this.name = petName;
        this.NameArray.add(petName);
    }
    
    @Override
    public String toString(){
        String MSG = "";
        for(int i=0; i < NameArray.size();i++){
            System.out.println("Your Pet Name: " + NameArray.get(i));
        }
        return MSG;
    }

    public String speak() {
        return "I'm your cuddly little pet.";
    }
}
