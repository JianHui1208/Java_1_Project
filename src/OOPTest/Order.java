package OOPTest;

public class Order {
    String Name;
    int quantity;
    double UnitPrice;
    
    public Order(){
    }
    
    public Order(String Name, int quantity, double UnitPrice){
        this.Name = Name;
        this.quantity = quantity;
        this.UnitPrice = UnitPrice;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getname(){
        return this.Name;
    }
    
    public int setQuantity(int quantity){
        this.quantity = quantity;
        return this.quantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public double setUnitPrice(double UnitPrice){
        this.UnitPrice = UnitPrice;
        return this.UnitPrice;
    }
    
    public double getUnitPrice(){
        return this.UnitPrice;
    }
    
    public double computePrice(){
        double totalPrice = 0;
        int QuantityCount = getQuantity();
        double UnitPriceCount = getUnitPrice();
        totalPrice = QuantityCount * UnitPriceCount;
        return totalPrice;
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println("Order Details");
        System.out.println("Customer name: " + getname());
        System.out.println("Quantity Order: " + getQuantity());
        System.out.println("Unit Price: RM" + getUnitPrice());
        return MSG;
    }
}
