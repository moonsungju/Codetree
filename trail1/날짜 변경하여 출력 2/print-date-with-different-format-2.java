import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String ymd = sc.next();
        String[] yymmdd = ymd.split("-");
        int y = Integer.parseInt(yymmdd[2]);
        int m = Integer.parseInt(yymmdd[0]);
        int d = Integer.parseInt(yymmdd[1]);
        System.out.println(y+"."+m + "."+d);
    }
}