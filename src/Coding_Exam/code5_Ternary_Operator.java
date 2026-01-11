package Coding_Exam;

import java.util.Scanner;

public class code5_Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        String result = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
        sc.close();
    }
}
