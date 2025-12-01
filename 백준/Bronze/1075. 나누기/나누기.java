import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        n = (n / 100) * 100;

        while (true) {
            if (n % f == 0) {
                break;
            }
            n++;
        }

        char[] c = String.valueOf(n).toCharArray();
        System.out.print(c[c.length - 2]);
        System.out.print(c[c.length - 1]);
    }
}