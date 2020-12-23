package OOPTest;

public class ShippedOrder extends Order{
    double weight;
    String address;
    public ShippedOrder(){
        super();
    }
    
    public ShippedOrder(String Name, int quantity, double UnitPrice, double weight, String address){
        super(Name, quantity, UnitPrice);
        this.weight = weight;
        this.address = address;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    @Override
    public double computePrice(){
        double totalPrice = 0;
        double subPrice = super.computePrice();
        double weightCount = getWeight();
        double KgPrice = 0;
        if(weightCount < 3){
            KgPrice = 4.5;
        }else if(weightCount > 3 || weightCount < 8){
            KgPrice = 3.85;
        }else if(weightCount > 8){
            KgPrice = 2;
        }
        
        totalPrice = subPrice + (KgPrice*weightCount);
        return totalPrice;
    }
    
    @Override
    public String toString(){
        String MSG = "";
        double totalPrice = computePrice();
        super.toString();
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Weight(KG): " + getWeight()+" kg");
        System.out.println("The item/s will be deliver to " + getAddress());
        return MSG;
    }
}
