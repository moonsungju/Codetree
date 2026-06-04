import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] A = new int[2];
        int[] B = new int[2];

        A[0] = sc.nextInt();
        A[1] = sc.nextInt();

        B[0] = sc.nextInt();
        B[1] = sc.nextInt();

        if(A[0] > B[0] && A[1] > B[1]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}