package coding_Exam18Jan;

import java.util.Scanner;

public class code4_Compare_2_Strings {
    public static void main(String[] args) {
        //Write a Java program to compare two strings and check whether they are equal or not.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1 = s.nextLine();

        System.out.println("Enter the Second string: ");
        String str2 = s.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("both strings are equal");
        } else {
            System.out.println("both strings are not equal");
        }
    }
}
