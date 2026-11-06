import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] date = s.split("\\.");
        System.out.println(date[1] + "-" + date[2] + "-" + date[0]);

    }
}