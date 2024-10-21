package assignment;

public class Employee {
	private int employeeNo;
	private String employeeName;
	private String address;

	// Constructor
	public Employee(int employeeNo, String employeeName, String address) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.address = address;
	}

	// Getters for employee details (optional)
	public int getEmployeeNo() {
		return employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getAddress() {
		return address;
	}

	// Method to display employee details
	public void displayEmployee() {
		System.out.println("Employee No: " + employeeNo);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Address: " + address);
	}
}
