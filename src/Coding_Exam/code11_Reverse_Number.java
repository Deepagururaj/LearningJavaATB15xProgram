package Coding_Exam;

public class code11_Reverse_Number {
    public static void main(String[] args) {
        int i = 123;
        int n = 0;
        do{
            int reverse  = i % 10;
            n = n * 10 + reverse;
            i= i / 10;

        }while (i > 0);
        System.out.println(n);
}
}
