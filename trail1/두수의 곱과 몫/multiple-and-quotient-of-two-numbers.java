import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        int mock = a / b;
        System.out.println(a + " * " + b + " = " + mul );
        System.out.println(a + " / " + b + " = " + mock);
    }
}