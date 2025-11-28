import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(fibonacciNumbers(N));
    }

    static int fibonacciNumbers(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
    }
}