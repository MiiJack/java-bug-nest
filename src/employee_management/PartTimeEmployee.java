package employee_management;

public class PartTimeEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    @Override
    public String details(){
        return super.details() +'\n'+"Hourly Rate: " + getHourlyRate() +
                '\n' + "Hours worked: " + getHoursWorked() +'\n'+"==========";
    }
    @Override
    public double calculateTax() {
        return getHoursWorked() * getHourlyRate() * 0.15;
    }

    @Override
    public double calculatePay(){
        return getHoursWorked() * getHourlyRate() - calculateTax();
    }
    @Override
    public String toString() {
        return super.toString() + '\n' +
                "hoursWorked=" + getHoursWorked() + '\n'+
                "==========";
    }
}

