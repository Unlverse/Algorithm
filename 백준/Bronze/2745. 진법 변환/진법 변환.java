import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] n = sc.next().toCharArray();
        int b = sc.nextInt();
        int[] arr = new int[n.length];

        for (int i = 0; i < n.length; i++) {
            if (47 < n[i] && n[i] < 58) {
                arr[i] = Integer.parseInt(String.valueOf(n[i]));
            } else {
                arr[i] = n[i] - 55;
            }
        }

        int result = arr[arr.length - 1];
        int temp = b;

        for (int i = arr.length - 2; i >= 0; i--) {
            result += arr[i] * temp;
            temp *= b;
        }

        System.out.println(result);
    }
}