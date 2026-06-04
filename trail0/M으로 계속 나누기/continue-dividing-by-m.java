import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        int M = sc.nextInt();
        
        int i = N / M;

        // Please write your code here.
        while (i > 0) {
            System.out.println(i);
            i /= M;
        }
    }
}
