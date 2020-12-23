package Tutorial.Q3;

public class Dog extends Pet {
    private double Weight;
    public double getWeight() {
        return Weight;
    }

    public void setWeight(double petWeight) {
        this.Weight = petWeight;
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println(getWeight());
        return MSG;
    }
    
    @Override
    public String speak() {
        return "Yes, master. Fetch i will.";
    }
}
