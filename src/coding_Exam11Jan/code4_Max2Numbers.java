package coding_Exam11Jan;

import java.util.Scanner;

public class code4_Max2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers: ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = (a > b )? a : b;
            System.out.println("Maximum is : "+ max);

        }else
            System.out.println("Enter the valid input");
    }
}
