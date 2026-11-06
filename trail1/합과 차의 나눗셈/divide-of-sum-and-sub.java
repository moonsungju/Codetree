import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a + b;
        int minus = a - b;
        double mock = (double)add / minus;
        System.out.printf("%.2f", mock);
    }
}