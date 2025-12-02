import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(gcd(a, b));
        System.out.println((a * b) / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else return b;
    }
}