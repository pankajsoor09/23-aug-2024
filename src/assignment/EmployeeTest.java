package assignment;
import java.util.Vector;
import java.util.Enumeration;

public class EmployeeTest {
    private static Vector<Employee> employees = new Vector<>();

    // Method to add employee details to the vector
    public static void addInput(int employeeNo, String employeeName, String address) {
        Employee employee = new Employee(employeeNo, employeeName, address);
        employees.add(employee);
    }

    // Method to display all employee details from the vector using Enumeration
    public static void display() {
        Enumeration<Employee> en = employees.elements();
        while (en.hasMoreElements()) {
            Employee employee = en.nextElement();
            employee.displayEmployee();
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        // Adding employee details
        addInput(101, "Rahul Sharma", "Delhi");
        addInput(102, "Sita Verma", "Mumbai");

        // Displaying employee details
        display();
    }
}
