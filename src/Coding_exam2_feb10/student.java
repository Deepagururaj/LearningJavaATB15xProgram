package Coding_exam2_feb10;

public class student {
    private String name;
    private int rollNo;
    private String section;

    // Constructor
    public student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }

}
