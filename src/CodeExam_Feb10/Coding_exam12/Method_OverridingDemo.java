package CodeExam_Feb10.Coding_exam12;

// Parent class
class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
}

// Child class
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class display method");
    }
}

public class Method_OverridingDemo {
    public static void main(String[] args) {
        // Parent object
        Parent p = new Parent();
        p.display();

        // Child object
        Child c = new Child();
        c.display();

        // Polymorphism: Parent reference, Child object
        Parent pc = new Child();
        pc.display();
    }

}
