import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int i;

        for(i = B; i > (A - 1); i -= 1) {
            System.out.print(i + " ");
        }
    }
}