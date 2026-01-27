package coding_Exam11Jan;

import java.util.Scanner;

public class code7_Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice number 1 to 4 which would you like to perform: ");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers : ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

          switch (choice) {
            case 1:
                System.out.println("Addition Result: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction Result: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication Result: " + (a * b));
                break;
            case 4:
                System.out.println("Division Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid output");
           }
        }
    }
}
