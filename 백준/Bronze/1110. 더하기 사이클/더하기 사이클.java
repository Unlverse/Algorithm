import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int next = n;
        int count = 1;

        while (true) {
            int first, second;

            if (next < 10) {
                first = 0;
                second = next;
            } else {
                first = next / 10;
                second = next % 10;
            }

            int sum = first + second;
            next = (second * 10) + (sum % 10);

            if (n == next) break;
            else count++;
        }
        System.out.println(count);
    }
}