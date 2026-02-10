package CodeExam_Feb10.Coding_exam10;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}

public class Multiple_Interface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
