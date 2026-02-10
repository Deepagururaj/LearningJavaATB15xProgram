package CodeExam_Feb10.Coding_exam6_feb10;

public class VehicleInheritance {
    public static void main(String[] args) {
        // Array of Vehicle references pointing to different objects
        Vehicle[] vehicles = { new Car(), new Bike() };

        // Runtime polymorphism: actual method depends on object type
        for (Vehicle v : vehicles) {
            v.start();
        }
    }

}
