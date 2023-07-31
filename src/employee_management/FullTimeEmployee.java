package employee_management;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    @Override
    public String details(){
        return super.details() +'\n' + "Monthly Salary: " + getMonthlySalary() + '\n'+"==========";
    }
    @Override
    public double calculateTax() {
        return getMonthlySalary() * 0.2;
    }
    @Override
    public double calculatePay(){
        return getMonthlySalary() - calculateTax();
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+
                "==========";
    }
}

