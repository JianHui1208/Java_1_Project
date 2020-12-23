package payrollcalsulation;

public class staff {
    private int staffId;
    private String staffName;

    public staff() {
    }

    public staff(int staffID, String staffName) {
        this.staffId = staffID;
        this.staffName = staffName;
    }

    public void setName(String name) {
        this.staffName = name;
    }

    public String getName() {
        return this.staffName;
    }

    public void setId(int ID) {
        this.staffId = ID;
    }

    public int getID() {
        return this.staffId;
    }

    @Override
    public String toString() {
        String MSG = "Name: " + getName() + "\n" + "Staff ID: " + getID();
        return MSG;
    }
}
