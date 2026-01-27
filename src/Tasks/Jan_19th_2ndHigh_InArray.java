package Tasks;

public class Jan_19th_2ndHigh_InArray {
    public static void main(String[] args){
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 34};
        int max1 = numbers[0];
        int max2 = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]> max1) {
                max2 = max1;
                max1 = numbers[i];
            }
            else if(numbers[i] > max2 && numbers[i] != max1){
                max2 = numbers[i];
            }
        }
        System.out.println("The second highest number in the given array is: " +max2);
    }
}
