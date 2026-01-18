package coding_Exam18Jan;

public class code1_Count_Char {
    public static void main(String[] args) {

        String input = "Guru   raj";

        int count = 0;
        for(int i = 0; i < input.length(); i++)
        {
            count++; // Count every character including space
        }
        System.out.println("Total number of characters (including spaces): " + count);
    }
}
