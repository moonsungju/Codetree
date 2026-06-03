import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int total = A + B;
        double average = total / 2.0;

        System.out.printf(total + "\t" + "%.1f", average);
    }
}