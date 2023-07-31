package employee_management;

import java.util.Objects;

public abstract class Employee {
    private int employeeId;
    private String name;
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double calculatePay();
    public abstract double calculateTax();
    public String details(){
        return "Name: "+name+'\n'+"ID: " +employeeId+'\n'+"Total pay: "+calculatePay();
    }
    private static int lastID = 0;
    public static int getEmployeeID(){
        lastID++;
        return lastID;
    }
    public static int getEmployeeID(int newID){
        lastID = newID;
        return lastID;
    }
    @Override
    public String toString() {
        return '\n'+
                "employeeId=" + employeeId + '\n' +
                "name=" + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.calculatePay(), calculatePay()) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

