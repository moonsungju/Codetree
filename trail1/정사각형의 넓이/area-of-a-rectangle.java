import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = N * N;
        System.out.println(S);

        if (N < 5) {
            System.out.println("tiny");
        }
    }
}