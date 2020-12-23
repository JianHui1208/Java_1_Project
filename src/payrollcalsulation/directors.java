package payrollcalsulation;

public class directors extends staff {
    private double GrossSales;
    private double TatolSalary;

    public directors() {
        super();
    }

    public directors(String name, int id, double GrossSales) {
        super(id, name);
        this.GrossSales = GrossSales;
    }

    public void setGrossSaless (double GrossSales) {
        this.GrossSales = GrossSales;
    }

    public double getGrossSales() {
        return this.GrossSales;
    }

    public void calculate() {
        double Gross = getGrossSales();
        double Salary = 0;
        if (Gross < 100000) {
            Salary = Gross * 5 / 100;
        } else if (Gross <= 100000 || Gross < 200000) {
            Salary = Gross * 6 / 100;
        } else if (Gross <= 200000 || Gross < 300000) {
            Salary = Gross * 8 / 100;
        } else if (Gross >= 300000) {
            Salary = Gross * 10 / 100;
        }
        this.TatolSalary = Salary;
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
