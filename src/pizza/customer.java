package pizza;

public class customer {
    String Name,PhoNumber;
    public customer(){}
    
    public customer(String Name, String PhoNumber){
        this.Name = Name;
        this.PhoNumber = PhoNumber;
    }
    
    public String setName(String Name){
        this.Name = Name;
        return this.Name;
    }
    
    public String setPhoNumber(String PhoNumber){
        this.PhoNumber = PhoNumber;
        return this.PhoNumber;
    }
    
    @Override
    public String toString(){
        String MSG = "Your Name: "+ setName(Name)+"\nYour Phone Number: "+setPhoNumber(PhoNumber);
        System.out.println(MSG);
        return MSG;
    }
}
