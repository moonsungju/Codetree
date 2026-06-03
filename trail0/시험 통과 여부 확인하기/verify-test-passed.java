import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int minus = 80 - N;

        if (N >= 80) {
            System.out.println("pass");
        } else {
            System.out.println(minus + " more score");
        }
    }
}