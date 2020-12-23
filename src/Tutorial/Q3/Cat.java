package Tutorial.Q3;

public class Cat extends Pet {
    private String Color;
    public String getColor() {
        return Color;
    }

    public void setColor(String petColor) {
        this.Color = petColor;
    }
    
    @Override
    public String toString(){
        String MSG = "";
        System.out.println(getColor());
        return MSG;
    }
    @Override
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }
}
