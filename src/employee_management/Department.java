package employee_management;

import java.util.Set;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */
    private String name;
    private Set<Employee> employeeList;

    public Department(String name, Set<Employee> employeeList) {
        this.name = name;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployeeList() {
        return employeeList;
    }
    public void getEmployeeDetails(){
        for (Employee employee: getEmployeeList()) {
            System.out.println(employee.details());
        }
    }
}
