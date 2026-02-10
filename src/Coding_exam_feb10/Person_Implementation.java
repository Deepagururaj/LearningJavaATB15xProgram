package Coding_exam_feb10;

public class Person_Implementation {
    private String name;
    private int age;

    // Constructor
    public Person_Implementation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
