package CodeExam_Feb10.Coding_exam7_feb10;

public abstract class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    // Method to display employee details
    public void displaySalary() {
        System.out.println(name + " Salary: " + calculateSalary());
    }

}
