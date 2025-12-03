import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        String result = "";

        while (n > 0) {
            int temp = n % b;

            if (temp > 9) result += (char)(temp + 55);
            else result += temp;

            n /= b;
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}