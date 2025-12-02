import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double average = (double) sum / n;
            int overAvg = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > average) {
                    overAvg++;
                }
            }
            double result = (double) overAvg / n * 100;
            result = Math.round(result * 1000) / 1000.0;
            System.out.println(result + "%");
        }
    }
}