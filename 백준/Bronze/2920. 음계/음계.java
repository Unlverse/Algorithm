import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else if (arr[i] - 1 == arr[i + 1]) {
                count--;
            }
        }

        if (count == 7) {
            System.out.println("ascending");
        } else if (count == -7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}