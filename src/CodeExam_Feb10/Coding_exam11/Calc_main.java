package CodeExam_Feb10.Coding_exam11;

class Calculator {
    // Overloaded method for two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method for three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calc_main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Integer addition: " + calc.add(5, 3));
        System.out.println("Double addition: " + calc.add(2.5, 3.7));
        System.out.println("Three integers addition: " + calc.add(1, 2, 3));
    }
}
