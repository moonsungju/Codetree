import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month >= 3 && month <6) {
            System.out.println("Spring");
        } else if (month>=6 && month<9) {
            System.out.println("Summer");
        } else if (month>=9 && month<12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}