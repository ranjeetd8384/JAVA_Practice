package JFSJD;
import java.util.Scanner;

public class EmployeeExplicitly {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter method for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    // Setter method for employee_id
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
        // Create an Employee object
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);

        // Input employee details from the user
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        employee.setEmployeeId(id);

        // Clear the newline character left in the buffer
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        employee.setEmployeeName(name);

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        employee.setEmployeeSalary(salary);

        scanner.close();

        // Display employee details
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: Rs " + employee.getEmployeeSalary());
    }
}
