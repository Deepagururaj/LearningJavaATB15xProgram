package coding_Exam18Jan;

import java.util.Scanner;

public class code3_Convert_To_UpperCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = s.nextLine();

        String result = name.toUpperCase();
        System.out.println("Convert Uppercase String: " + result);
    }
}
