package Tasks;

import java.util.Scanner;

public class Jan_16th_Reverse_String {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scan.next();

        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
}
