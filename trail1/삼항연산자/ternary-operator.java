import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        String c;

        c = grade == 100 ? "pass" : "failure";
        System.out.println(c);
    }
}