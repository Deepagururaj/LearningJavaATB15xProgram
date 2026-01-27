package coding_Exam11Jan;

import java.util.Scanner;

public class code2_Even_Odd_Number {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            if(scan.hasNextInt()) {
                int num = scan.nextInt();
                if (num % 2 == 0)
                    System.out.println("This is a even number");
                else
                    System.out.println("This is an odd number");
            }else
                System.out.println("Enter valid input");
        }
}
