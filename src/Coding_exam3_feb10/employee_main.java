package Coding_exam3_feb10;

public class employee_main {
    public static void main(String[] args) {
        // Creating Employee object
        employee emp = new employee(1, "John Doe", 50000);

        // Displaying details
        emp.display();

        // Updating salary using setter
        emp.setSalary(60000);

        System.out.println("\nAfter Salary Update:");
        emp.display();
    }

}
