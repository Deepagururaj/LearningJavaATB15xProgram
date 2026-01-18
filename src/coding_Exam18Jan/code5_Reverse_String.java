package coding_Exam18Jan;

public class code5_Reverse_String {
    public static void main(String[] args) {
        //Write a Java program to count the total number of characters in a given string (excluding spaces).
        String s = "Deepa";
        String reverse = " ";

            for (int i = s.length()-1; i >= 0; i--)
            {
                reverse = reverse + (s.charAt(i));
            }
            System.out.println("String Reversed: " + reverse);
        }
}
