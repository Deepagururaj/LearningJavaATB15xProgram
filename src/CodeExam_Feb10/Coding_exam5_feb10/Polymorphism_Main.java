package CodeExam_Feb10.Coding_exam5_feb10;

public class Polymorphism_Main {
    public static void main(String[] args) {
        // Polymorphism: Animal reference, Dog object
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calls overridden methods
        dog.makeSound();
        cat.makeSound();
    }
}
