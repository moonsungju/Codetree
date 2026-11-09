import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int middle = sc.nextInt();
        int finall  = sc.nextInt();

        if (middle>=90 && finall >=95) {
            System.out.println(100000);
        } else if (middle>=90 && finall >=90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }
    }
}