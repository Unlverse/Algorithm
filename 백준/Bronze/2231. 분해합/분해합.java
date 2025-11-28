import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (N == check(i)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    static int check(int n) {
        int sum = n;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}