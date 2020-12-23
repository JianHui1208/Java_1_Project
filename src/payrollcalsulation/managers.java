package payrollcalsulation;

public class managers extends staff {
    private double CarAllowance;
    private double TatolSalary;

    public managers() {
        super();
    }

    public managers(String name, int id, double CarAllowance) {
        super(id, name);
        this.CarAllowance = CarAllowance;
    }

    public void setAllowances(double Allowance) {
        this.CarAllowance = Allowance;
    }

    public double getAllowance() {
        return this.CarAllowance;
    }

    public void calculate() {
        double Allowance = getAllowance();
        double salary = 2000;
        double TotalSalary = salary + Allowance;
        this.TatolSalary = TotalSalary;
    }

    public double getTatolSalary() {
        return this.TatolSalary;
    }

    @Override
    public String toString() {
        calculate();
        String MSG = super.toString() + "\nTotal Salary: " + getTatolSalary();
        return MSG;
    }
}
