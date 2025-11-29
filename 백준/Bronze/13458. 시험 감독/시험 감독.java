import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int general = sc.nextInt();
        int assist = sc.nextInt();
        long total = N;

        for (int i = 0; i < N; i++) {
            if (arr[i] > general) {
                total += (arr[i] - general) / assist;
                if ((arr[i] - general) % assist != 0) {
                    total++;
                }
            }
            
        }

        System.out.println(total);
    }
}