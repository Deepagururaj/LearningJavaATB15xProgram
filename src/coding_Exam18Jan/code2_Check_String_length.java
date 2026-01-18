package coding_Exam18Jan;

import java.util.Scanner;

public class code2_Check_String_length {
    static void main(String[] args) {

       String s = "Deepa Ragunath";
        int result = s.length();
        if (s.length() >= 10)
        {
            System.out.println("Length of a given string is greater than 10: " + result);
        }
        else {
            System.out.println("Length of a given string is less than 10: " + result);

        }
    }
}
