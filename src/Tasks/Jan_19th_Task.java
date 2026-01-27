package Tasks;

public class Jan_19th_Task {
    public static void main(String[] args) {
        System.out.println("Pyramid Pattern");
        int n=5;
        for(int i=1; i<= n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
