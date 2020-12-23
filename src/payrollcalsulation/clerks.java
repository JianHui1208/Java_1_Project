package payrollcalsulation;

public class clerks extends staff {
    private double hour;
    private double tatolSalary;

    public clerks() {
        super();
    }

    public clerks(String name, int id, double hour) {
        super(id, name);
        this.hour = hour;
    }

    public void setHours(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return this.hour;
    }

    private void calculate() {
        double hours = getHour();
        double salary = 1000;
        double hourlyRate = 50;
        double overtimePaid = hourlyRate * hours;
        double TotalSalary = salary + overtimePaid;
        this.tatolSalary = TotalSalary;
    }

    public double getTatolSalary() {
        return this.tatolSalary;
    }

    @Override
    public String toString() {
        calculate();
        String MSG = super.toString() + "\nTotal Salary: " + getTatolSalary();
        return MSG;
    }
}