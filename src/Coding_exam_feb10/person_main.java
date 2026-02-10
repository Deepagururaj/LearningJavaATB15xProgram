package Coding_exam_feb10;


public class person_main {
        public static void main(String[] args) {
            // Creating Person objects
            Person_Implementation p1 = new Person_Implementation("John", 25);
            Person_Implementation p2 = new Person_Implementation("Alice", 30);

            // Displaying their details
            p1.display();
            p2.display();
        }

}
