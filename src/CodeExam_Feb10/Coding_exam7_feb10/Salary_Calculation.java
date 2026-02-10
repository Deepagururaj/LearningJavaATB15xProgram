package CodeExam_Feb10.Coding_exam7_feb10;

public class Salary_Calculation {
    public static void main(String[] args) {
        // Creating Manager and Developer objects
        Employee manager = new Manager("Manager", 60000, 10000);
        Employee developer = new Developer("Developer", 50, 160);

        // Displaying salaries
        manager.displaySalary();
        developer.displaySalary();
    }
}
