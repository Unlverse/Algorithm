import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int temp[] = new int[J - I +1];
            int index = 0;

            for (int j = J; j >= I ; j--) {
                temp[index++] = arr[j];
            }

            index = 0;
            for (int j = I; j <= J; j++) {
                arr[j] = temp[index++];
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}