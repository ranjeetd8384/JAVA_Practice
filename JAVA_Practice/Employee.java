package JFSJD;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public static void main(String[] args) {
      
        Employee employee = new Employee();
        
        // Set employee details using setter methods
        employee.setEmployeeId(150);
        employee.setEmployeeName("Ranjeet Deshmukh");
        employee.setEmployeeSalary(70000.0);
        
     // Display employee details 
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: Rs " + employee.getEmployeeSalary());
        
     // Update employee information using setter methods
        employee.setEmployeeId(140);
        employee.setEmployeeName("Digvijay Patil");
        employee.setEmployeeSalary(60000.0);
        
        // updated employee details
        System.out.println("Updated Employee ID: " + employee.getEmployeeId());
        System.out.println("Updated Employee Name: " + employee.getEmployeeName());
        System.out.println("Updated Employee Salary: Rs " + employee.getEmployeeSalary());
    }
}
